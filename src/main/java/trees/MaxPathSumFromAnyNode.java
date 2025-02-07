package trees;

public class MaxPathSumFromAnyNode {

    int max = Integer.MIN_VALUE;

    public int maxPathSum(Node root) {
        helper(root);
        return max;
    }

    // helper returns the max branch
    // plus current node's value
    int helper(Node root) {
        if (root == null) return 0;

        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);

        max = Math.max(max, root.key + left + right);

        return root.key + Math.max(left, right);
    }

}
