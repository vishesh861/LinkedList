package trees;

public class CheckIdenticalTrees {

    public boolean check(Node node1, Node node2) {

        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 != null && node2 != null) {

            return node1.key == node2.key && check(node1.left, node2.left) && check(node1.right, node2.right);
        }
        return false;
    }
}
