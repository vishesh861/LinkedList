package trees;

public class Mirror {

    public void mirror(Node node) {

        if (node == null) {
            return;
        }

        Node temp;

        mirror(node.left);
        mirror(node.right);

        temp = node.left;
        node.left = node.right;
        node.right = temp;

    }
}
