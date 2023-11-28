package org.tzi.use.gui.views.AssistantView;


public class FAQNode {
    // Node data fields.
    String question;
    String buttonText;
    String answer;

    // Node connections for tree datastructure.
    FAQNode leftChild;
    FAQNode rightChild;
    FAQNode parent;

    public FAQNode(String question, String buttonText, String answer) {
        this.question = question;
        this.buttonText = buttonText;
        this.answer = answer;
        this.leftChild = null;
        this.rightChild = null;
        this.parent = null;
    }

    // Sets left child for node.
    public void setLeftChild(FAQNode leftChild) {
        this.leftChild = leftChild;
        if (leftChild != null) {
            leftChild.parent = this;
        }
    }

    // Sets right child for node.
    public void setRightChild(FAQNode rightChild) {
        this.rightChild = rightChild;
        if (rightChild != null) {
            rightChild.parent = this;
        }
    }

    // For navigating through the tree, current node is stored in tree datastructure.
    // Returns the left child of the node.
    public FAQNode getLeftChild() {
        return leftChild;
    }

    // Returns the right child of the node.
    public FAQNode getRightChild() {
        return rightChild;
    }

    // Returns the parent node of the node.
    public FAQNode getParent() {
        return parent;
    }

    // Returns the button text for display on the GUI.
    public String getButtonText() {
        return buttonText;
    }

    // Returns the answer to be set on GUI.
    public String getAnswer() {
        return answer;
    }

    // Returns the question to be set on GUI.
    public String getQuestion(){
        return question;
    }

    public boolean isLeaf() {
        return leftChild == null && rightChild == null;
    }
}

