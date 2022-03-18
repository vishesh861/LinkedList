package trees;

public class Sum { 

    int total=0;
    public int sumOfLeftLeaves(Node root) {

        sum1(root);
        return total;

    }

    public void sum1(Node root) {

        if (root != null) {

            sum1(root.left);
            total += root.key;
            sum1(root.right);
        }
    }
}
