package org.tzi.use.gui.views.AssistantView;

import org.tzi.use.gui.main.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// MAB - Window object for setting API key for Assistant.
// Key is stored on the main window, where the assistant window, and API caller object can access it.

public class APIKeySetterWindow extends JFrame {

    private JTextField apiKeyTextField;
    private MainWindow mainWindowReference;

    public APIKeySetterWindow(MainWindow mainWindow) {

        this.mainWindowReference = mainWindow;

        // Set the title of the JFrame.
        setTitle("Set OpenAI API Key");

        // Create and set the layout manager for the JFrame.
        setLayout(new BorderLayout());

        // Create a JLabel for the title
        JLabel titleLabel = new JLabel("Enter your API key");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        // Create a JTextField for entering the API key
        apiKeyTextField = new JTextField();
        apiKeyTextField.setPreferredSize(new Dimension(200, 25));
        apiKeyTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Call the setApiKey function here with apiKeyTextField.getText()
                setApiKey(apiKeyTextField.getText());
            }
        });

        apiKeyTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
 
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    e.consume();  
                    setApiKey(apiKeyTextField.getText());
                }
            }
 
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        // Create a JButton for submitting the API key
        JButton enterButton = new JButton("Enter");
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setApiKey(apiKeyTextField.getText());
            }
        });

        // Create a JPanel to hold the text field and button horizontally.
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(apiKeyTextField);
        inputPanel.add(enterButton);

        // Add components to the JFrame.
        add(titleLabel, BorderLayout.NORTH);
        add(inputPanel, BorderLayout.CENTER);

        // Set the size, location, and close operation for the JFrame.
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(this.mainWindowReference);
    }

    private void setApiKey(String apiKey) {
        // Set API key to field in mainWindow GUI.
        this.mainWindowReference.setAPI_KEY(apiKey);
        this.dispose();
    }
}
