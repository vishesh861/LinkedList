package trees;

class Pair {

    int first, second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class MaximumSumOfNonAdjacentNodes {

    private static Pair getMax(Node root) {

        if (root == null) {

            Pair sum = new Pair(0, 0);
            return sum;

        }

        Pair sum1 = getMax(root.left);
        Pair sum2 = getMax(root.right);
        Pair sum = new Pair(0, 0);

        sum.first = sum1.second + sum2.second + root.key;

        sum.second = Math.max(sum1.first, sum1.second) + Math.max(sum2.first, sum2.second);

        return sum;
    }


    public static int getMaxPair(Node root) {

        Pair result = getMax(root);

        return Math.max(result.first, result.second);
    }
}
