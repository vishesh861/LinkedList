package trees;

public class KthNodeFromRoot {

    public void kth(Node node, int k) {

        if (node == null) {
            return;
        }

        if (k == 0) {
            System.out.println(node.key + " ");
        } else {
         kth(node.left, k-1);
         kth(node.right, k-1);
        }
    }
}
