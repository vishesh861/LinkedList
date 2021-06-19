package BST;

public class FixBstWithTwoNodesSwapped {

    public void swap(Node node) {
        Node prev = null,first = null,second = null;
        swap(node.left);
        if (prev != null && prev.key > node.key) {

            if (first == null) {
                first = prev;
            }
            second = node;
        }
        prev = node;
        swap(node.right);
    }
}
