package trees;

public class Postorder {

    public void postorder(Node node) {

        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.key + " ");
        }
    }
}
