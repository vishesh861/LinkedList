package BST;

public class FixBstWithTwoNodesSwapped {

    Node prev = null, first = null, second = null;

    public void recoverTree(Node root) {
        evalSwappedNodes(root);
        int temp = first.key;
        first.key = second.key;
        second.key = temp;
    }

    private void evalSwappedNodes(Node curr) {
        if (curr == null)
            return;
        evalSwappedNodes(curr.left);
        if (prev != null && prev.key > curr.key) {
            if (first == null)
                first = prev;
            second = curr;
        }
        prev = curr;
        evalSwappedNodes(curr.right);
    }
}
