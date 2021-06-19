package BST;

public class CeilValue {

    public Node ceil(Node node, int x) {

        Node res = null;
        while (node != null) {

            if (node.key == x) {
                return node;
            } else if (node.key < x) {
                node = node.right;
            } else {
                res = node;
                node = node.left;
            }
        }
        return res;
    }
}
