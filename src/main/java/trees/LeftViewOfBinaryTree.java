package trees;

import java.util.ArrayList;

public class LeftViewOfBinaryTree {

    int max_level = 0;
    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        leftViewUtil(result, root, 1);
        return result;
    }

    private void leftViewUtil(ArrayList<Integer> result, Node node, int level) {

        if (node==null) return;

        if (max_level < level)
        {
            result.add(node.key);
            max_level = level;
        }

        leftViewUtil(result, node.left, level+1);
        leftViewUtil(result, node.right, level+1);
    }
}
