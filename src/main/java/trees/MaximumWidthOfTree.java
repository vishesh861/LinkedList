package trees;

public class MaximumWidthOfTree {

    public int max_width(Node node) {

        int width = 0;
        int h = height(node);
        int maxWidth = 0;

        for (int i=0; i<=h; i++) {

            width = getWidth(node, i);
            if (width > maxWidth) {
                maxWidth = width;
            }
        }
        return maxWidth;
    }

    private int getWidth(Node node, int i) {

        if (node == null) {
            return 0;
        }

        if (i == 1) {
            return 1;
        } else if (i > 1) {

            return getWidth(node.left, i-1) + getWidth(node.right, i-1);
        }
        return 0;

    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            return Math.max(height(node.left),height(node.right) + 1);
        }
    }
}
