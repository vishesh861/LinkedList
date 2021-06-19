package trees;

public class FoldableTree {

    public boolean foldable (Node node) {

        if (node == null) {
            return true;
        }

        return isFoldable(node.left, node.right);
    }

    private boolean isFoldable(Node n1, Node n2) {

        if (n1 == null && n2 == null) {
            return true;
        }

        if (n1 == null || n2 == null) {
            return false;
        }

        return isFoldable(n1.left, n2.right) && isFoldable(n1.right, n2.left);
    }
}
