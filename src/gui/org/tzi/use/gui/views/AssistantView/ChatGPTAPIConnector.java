package org.tzi.use.gui.views.AssistantView;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatGPTAPIConnector {

    private String API_KEY;
    private boolean keySet;

    public ChatGPTAPIConnector(){
        this.keySet = false;
    }

    public ChatGPTAPIConnector(String API_KEYtoSet){
        this.setAPI_KEY(API_KEYtoSet);
        this.keySet = true;
    }

    public String getResponse(String prompt) {
        String url = "https://api.openai.com/v1/chat/completions";
        String apiKey = this.API_KEY;
        // String model = "gpt-3.5-turbo";   <-use this for a default model
        // Using custom trained model.
        String model = "ft:gpt-3.5-turbo-0613:personal::8T04DUuU";

        try {
             // Create URL post structure for OpenAI API.
            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
 
            // Set connection properties specified by OpenAI documentation.
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Authorization", "Bearer " + apiKey);
            connection.setRequestProperty("Content-Type", "application/json");
 
            // The request body
            // TODO: Set system properties.
            String body = "{\"model\": \"" + model + "\", \"messages\": [" + "{\"role\": \"system\", \"content\": \"" + "You are helpful chat bot. When you encounter TPV, USE, OCL, or TOCL in the user\'s question, answer using model driven engineering terms." + "\"}" + 
                ", {\"role\": \"user\", \"content\": \"" + prompt + "\"}]}";

            connection.setDoOutput(true);
 
            OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
 
            writer.write(body);
            writer.flush();
            writer.close();
 
            // Get response from ChatGPT API.
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
 
            StringBuffer response = new StringBuffer();
 
            while ((line = br.readLine()) != null) {
                response.append(line);
            }
            br.close();
 
            // Calls the method to extract the message from JSON response.
            return extractMessageFromJSONResponse(response.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String extractMessageFromJSONResponse(String response) {
        int start = response.indexOf("content")+ 11;
        int end = response.indexOf("\"", start);

        return response.substring(start, end);
    }

    public boolean getKeyStatus(){
        return this.keySet;
    }

    // API key setter and getter funcitons.
    public void setAPI_KEY(String API_KEYtoSet){
        this.API_KEY = API_KEYtoSet;
    }

    public String getAPI_KEY(){
        return this.API_KEY;
    }
}