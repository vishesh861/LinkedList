package trees;

public class Inorder {

        public void inorder(Node node) {

        if (node != null) {
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }
}
