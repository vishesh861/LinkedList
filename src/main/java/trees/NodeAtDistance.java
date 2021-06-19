package trees;

import java.util.ArrayList;

public class NodeAtDistance {

    public int distance(Node node, int distance) {

        ArrayList<Node> list = new ArrayList<>();

        int h = height(node);
        int k = h - distance - 1;

        ArrayList<Node> l = kthNode(node, k, list);

        return l.size();
    }

    private ArrayList<Node> kthNode(Node node, int k, ArrayList<Node> list) {

        if (node == null) {
            return list;
        }

        if (k == 0) {
            list.add(node);
        } else {
            kthNode(node.left, k-1, list);
            kthNode(node.right, k-1, list);
        }
        return list;
    }

    private int height(Node node) {

        if (node == null) {
            return 0;
        } else {
            return Math.max(height(node.left), height(node.right)) + 1;
        }
    }
}
