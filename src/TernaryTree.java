import java.util.NoSuchElementException;

public class TernaryTree {

    private class Node {
        private int value;
        private int subtree; // the size of the subtree
        private Node left;
        private Node middle;
        private Node right;

        public Node(int init) {
            value = init;
            subtree = 0;
        }
    }

    Node root;


    public void insert(int newValue) {
        // create new root if tree is empty
        if (root == null) {
            root = new Node(newValue);
        } else {
            insert(root, new Node(newValue));
        }
    }

    private void insert(Node root, Node newNode) {
        if (newNode == null) {
            return;
        }

        incrementSubtree(root);

        // determine which node the new node should be a child of, insert it in that node recursively
        if (newNode.value < root.value) {
            if (root.left == null) {
                root.left = newNode;
            } else {
                insert(root.left, newNode);
            }
        } else if (newNode.value > root.value) {
            if (root.right == null) {
                root.right = newNode;
            } else {
                insert(root.right, newNode);
            }
        } else {
            if (root.middle == null) {
                root.middle = newNode;
            } else {
                insert(root.middle, newNode);
            }
        }

    }
    private void incrementSubtree(Node n) {
        n.subtree = n.subtree + 1;
    }

}