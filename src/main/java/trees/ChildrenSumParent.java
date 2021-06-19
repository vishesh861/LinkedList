package trees;

public class ChildrenSumParent {

    public int isSum(Node node) {

        if (node == null || node.left == null && node.right == null) {
            return 1;
        } else {

            if (node.key == node.left.key + node.right.key && isSum(node.left) != 0 && isSum(node.right) != 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}


