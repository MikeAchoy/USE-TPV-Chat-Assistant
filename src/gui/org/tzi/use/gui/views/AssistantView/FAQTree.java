package org.tzi.use.gui.views.AssistantView;

public class FAQTree {
    FAQNode root;
    FAQNode currentQuestion;

    public FAQTree() {
        // Initializes tree with initial questions and answers.
        this.root = new FAQNode("", "", "");

        FAQNode rootLeftChild = new FAQNode("What is USE, and what is it used for?", "What is USE..", "The UML-based Specification Environment (USE) is a system for the specification and validation of information systems based on a subset of the Unified Modeling Language (UML) and the Object Constraint Language (OCL). ");
        FAQNode rootRightChild = new FAQNode("What is TPV, and what is it used for?", "What is TPV..", "The Temporal Property Validator (TPV) is a lightweight analysis tool for validating temporal properties on UML class diagrams. TPV implements a new analysis framework that aims to eliminate the need to learn non-UML formal specification and verification methods that can be challenging.");

        root.setLeftChild(rootLeftChild);
        root.setRightChild(rootRightChild);

        // USE question was selected, add more USE related questions.
        FAQNode leftQ1 = new FAQNode("How do I create a new project with USE?", "Create USE File..", "To create and open a UML file in USE, you must first create a USE specification for your UML diagram ending in .use, you can find how to write a USE specification following the quick start guide on our GitHub https://github.com/useocl/use . When you have written your UML class file, you can open it using the file menu and opening the USE specification where you can then use the tools provided in the USE.");
        FAQNode leftQ2 = new FAQNode("What features are available in USE?", "USE Features..", "In the USE, you can specify a UML model withint USE, analyze a formal specification, print diagrams, and view models in an interactive environment. ");

        // TPV question was selected, add more TPV related questions.
        FAQNode rightQ1 = new FAQNode("What can you do with the TPV?", "TPV Features..", "With the Temporal Property Validator tool (TPV) you are able to use validate a UML class diagram using temporal properties to make sure it satisfies its behavioral requirements. Both can be imported into TPV. The tool's output is the counter example if the model is not otherwise considered satisfied");
        FAQNode rightQ2 = new FAQNode("How can I validate a USE specification with TPV?", "TPV Validation..", "Assuming you already have a UML class diagram and one or more temporal properties specified, click on the validate button to perform the validation. You may get a counter example by the tool if the model is not considered satisfied to aid in model checking. You can also get a sequence diagram to assist in understanding the counter example.");

        // Assign the nodes to root parent.
        rootLeftChild.setLeftChild(leftQ1);
        rootLeftChild.setRightChild(leftQ2);

        rootRightChild.setLeftChild(rightQ1);
        rootRightChild.setRightChild(rightQ2);

        // TODO: Expand tree with FAQ and their answers.

        // Set the initial current question to the root.
        currentQuestion = root;
    }

    public FAQNode getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(FAQNode question) {
        currentQuestion = question;
    }

    public void navigateBack() {
        FAQNode parent = currentQuestion.getParent();
        if (parent != null) {
            // Set the parent node as the current question
            setCurrentQuestion(parent);
        }
    }

    public void navigateToChild(boolean isLeftChild) {
        FAQNode childNode = isLeftChild ? currentQuestion.getLeftChild() : currentQuestion.getRightChild();

        if (childNode != null) {
            // Set the child node as the current question
            setCurrentQuestion(childNode);
        }
    }
}

