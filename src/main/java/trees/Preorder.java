package trees;

public class Preorder {

    public void preorder(Node node) {

        if (node != null) {
            System.out.print(node.key + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }
}
