package BST;

import java.util.HashSet;

public class PairSumWithGivenBST {

    public boolean pair(Node node, int sum) {

        HashSet<Integer> set = new HashSet<>();

        if (node == null) {
            return false;
        }

        if (pair(node.left, sum) == true) {
            return true;
        }
        if (set.contains(sum-node.key)) {
            return true;
        } else {
            set.add(node.key);
        }
        return pair(node.right, sum);
    }
}
