package trees;

public class CountSubTreeWithGivenSum {

    int count = 0;

    public int countSubTreeWithSum(Node root, int x) {

        if (root == null) {
            return 0;
        }

        int ls = count(root.left, x);

        int rs = count(root.right, x);

        if (ls + rs + root.key == x) {
            count++;
        }

        return count;
    }

    private int count(Node root, int x) {

        if (root == null) {
            return 0;
        }

        int ls = count(root.left, x);

        int rs = count(root.right, x);

        int sum = ls + rs + root.key;

        if (sum == x) {
            count++;
        }

        return sum;

    }
}
