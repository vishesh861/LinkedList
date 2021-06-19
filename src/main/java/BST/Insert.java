package BST;

public class Insert {

    //Time O(h)  Space O(h)
    public Node insert(Node node, int x) {

        if (node == null) {
            return new Node(x);
        } else if (node.key > x) {
            node.left = insert(node.left, x);
        } else if (node.key < x) {
            node.right = insert(node.right, x);
        }
        return node;
    }
}
