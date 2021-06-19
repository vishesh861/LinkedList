package trees;

public class MaxPathSumFromAnyNode {

    int res;
    public int max(Node node, int res) {

        if (node == null) {
            return 0;
        }

        int l = max(node.left, res);
        int r = max(node.right, res);

        int max_single = Math.max(Math.max(l, r) + node.key,
                node.key);

        int max_top = Math.max(max_single, l + r + node.key);

        res = Math.max(res, max_top);

        return max_single;
    }

    public int max_path(Node node) {

        res = Integer.MIN_VALUE;

        max(node, res);

        return res;
    }

}
