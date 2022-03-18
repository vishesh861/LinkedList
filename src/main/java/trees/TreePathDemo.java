package trees;

public class TreePathDemo {

    public int pathSum(Node root, int sum) {

        int curCount = isMeetSum(root, sum);
        if (root == null) {
            return 0;
        }

        return curCount + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public int isMeetSum(Node root, int sum) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        if (root.key == sum) {
            count++;
        }
        return count + isMeetSum(root.left, sum - root.key) + isMeetSum(root.right, sum - root.key);
    }

}
