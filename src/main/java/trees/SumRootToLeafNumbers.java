package trees;


/*Input: root = [1,2,3]
        Output: 25
        Explanation:
        The root-to-leaf path 1->2 represents the number 12.
        The root-to-leaf path 1->3 represents the number 13.
        Therefore, sum = 12 + 13 = 25.*/
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
