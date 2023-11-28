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
        FAQNode leftQ1 = new FAQNode("How do I create a new project with USE?", "Create USE Project..", "A");
        FAQNode leftQ2 = new FAQNode("What features are available in USE?", "USE Features..", "A");

        // TPV question was selected, add more TPV related questions.
        FAQNode rightQ1 = new FAQNode("What can you do with the TPV?", "TPV Features..", "A");
        FAQNode rightQ2 = new FAQNode("How can I validate a USE specification with TPV?", "TPV Validation..", "A");

        // Assign the nodes to root parent.
        rootLeftChild.setLeftChild(leftQ1);
        rootLeftChild.setRightChild(leftQ2);

        rootRightChild.setLeftChild(rightQ1);
        rootRightChild.setRightChild(rightQ2);

        // TODO: Create new nodes and assign to tree with FAQ and their answers.


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

