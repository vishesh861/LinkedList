package trees;

import java.util.ArrayList;

public class LevelOrderTraversalSpiralForm {

    public ArrayList<Integer> spiral(Node node) {

        ArrayList<Integer> list = new ArrayList<>();

        if (node == null) {
            return list;
        }
        int h = height(node);
        boolean flag = false;

        for (int i=1; i<=h; i++) {
            print(list, node, i, flag);
            flag = !flag;
        }

        return list;
    }

    private void print(ArrayList<Integer> list, Node node, int i, boolean flag) {

        if(node == null) {
            return;
        }

        if(i == 1) {
            list.add(node.key);
        } else if (i > 1) {

            if (flag != false) {
                print(list, node.left, i-1, flag);
                print(list, node.right, i-1, flag);
            } else {
                print(list, node.right, i-1, flag);
                print(list, node.left, i-1, flag);
            }
        }
    }

    private int height(Node node) {

        if (node == null) {
            return 0;
        } else {
            return Math.max(height(node.left),height(node.right)) + 1;
        }
    }
}
