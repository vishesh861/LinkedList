package BST;

public class CheckForBST {

    Node node;
    public boolean check(Node node) {

        return isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(Node node, int minValue, int maxValue) {

        if (node == null) {
            return true;
        }

        if (node.key < minValue || node.key > maxValue) {
            return false;
        }

        return isBST(node.left, minValue, node.key-1) &&
                isBST(node.right, node.key + 1, maxValue);
    }
}
