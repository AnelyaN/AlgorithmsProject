import java.util.ArrayList;

public class ExponentialTrees {

    private class Node {
        int value;
        int currentNodeLevel;
        ArrayList<Node> children;
        Node left;
        Node right;
        Node newNode;

        private Node(int init) {
            currentNodeLevel = 1;
            value = init;
            left = right = null;
            children.set(currentNodeLevel, newNode);
        }
    }

    Node root;

    private void insert(int newValue) {
        root = insertNode(root, new Node(newValue));
    }

    Node insertNode(Node root, Node newNode){
        if (root == null) {
            root = new Node(newNode.value);
            return root;
        }

        incrementNodes(root);

        if (newNode.value < root.value) {
            root.left = insertNode(root.left, newNode);
        } else if (newNode.value > root.value) {
            root.right = insertNode(root.right, newNode);
        }

        return root;
    }

    private void incrementNodes(Node root) {
        root.currentNodeLevel = root.currentNodeLevel * 2;
    }
}
