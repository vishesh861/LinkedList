package BST;

public class FloorValue {

    public Node floor(Node node, int x) {

        Node res = null;
        while (node != null) {

            if (node.key == x) {
                return node;
            } else if (node.key > x) {
                node = node.left;
            } else {
                res = node;
                node = node.right;
            }
        }
        return res;
    }
}
