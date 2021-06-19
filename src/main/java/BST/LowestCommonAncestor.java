package BST;

public class LowestCommonAncestor {

    public Node lowest(Node node, int n1, int n2) {

        if (node == null) {
            return null;
        }

        if (node.key > n1 && node.key > n2) {
            return lowest(node.left, n1, n2);
        }

        if (node.key < n1 && node.key < n2) {
            return lowest(node.right, n1, n2);
        }

        return node;
    }
}
