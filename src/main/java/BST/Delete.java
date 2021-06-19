package BST;

public class Delete {
 // Time O(h)  Space O(h)
    public Node delete(Node node, int x) {

        if (node == null) {
            return null;
        } else if (node.key > x) {
            node.left = delete(node.left, x);
        } else if (node.key < x) {
            node.right = delete(node.right, x);
        } else {

            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                Node succ = getSucc(node);
                node.key = succ.key;
                node.right = delete(node.right, succ.key);
            }
        }
        return node;
    }

    private Node getSucc(Node node) {

        Node curr = node.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }
}
