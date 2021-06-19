package trees;

import java.util.concurrent.atomic.AtomicBoolean;

public class CheckBalancedOrNot {

    public static int isHeightBalanced(Node root, AtomicBoolean isBalanced)
    {
        if (root == null || !isBalanced.get()) {
            return 0;
        }

        int left_height = isHeightBalanced(root.left, isBalanced);

        int right_height = isHeightBalanced(root.right, isBalanced);

        if (Math.abs(left_height - right_height) > 1) {
            isBalanced.set(false);
        }

        return Math.max(left_height, right_height) + 1;
    }

    public boolean isHeightBalanced(Node root)
    {

        AtomicBoolean isBalanced = new AtomicBoolean(true);
        isHeightBalanced(root, isBalanced);

        return isBalanced.get();
    }

}
