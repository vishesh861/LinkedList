package trees;

public class SumRootToLeafNumbers {

    public int sumNumbers(Node root) {
        return dfs(root, 0);
    }

    private int dfs(Node node, int pathSum) {
        if (node == null)
            return 0;

        pathSum = pathSum * 10 + node.key;

        if (node.left == null && node.right == null)
            return pathSum;

        return dfs(node.left, pathSum) + dfs(node.right, pathSum);
    }
}
