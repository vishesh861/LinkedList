package trees;

import java.util.LinkedList;

public class DeepestLeavesSum {

    public int sum(Node node) {

        int sum = 0,i;
        LinkedList<Node> list = new LinkedList<>();
        list.add(node);
        while (!list.isEmpty()) {

            for (i=list.size()-1, sum = 0; i >= 0; i--) {

                Node temp = list.poll();
                sum += temp.key;
                if (temp.right != null) {
                    list.add(temp.right);
                }
                if (temp.left != null) {
                    list.add(temp.left);
                }
            }
        }
        return sum;
    }
}
