package trees;

import java.util.ArrayList;

public class RightViewOfBinaryTree {

    int max_level = 0;
    ArrayList<Integer> rightView(Node root)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        rightViewUtil(result, root, 1);
        return result;
    }

    private void rightViewUtil(ArrayList<Integer> result, Node node, int level) {

        if (node==null) return;

        if (max_level < level)
        {
            result.add(node.key);
            max_level = level;
        }

        rightViewUtil(result, node.right, level+1);
        rightViewUtil(result, node.left, level+1);
    }
}
