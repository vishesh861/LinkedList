package BST;

import java.util.Stack;

public class BinarySearchTreeIterator {

    private Stack<Node> stack = new Stack<Node>();

    public BinarySearchTreeIterator(Node root) {
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        Node tmpNode = stack.pop();
        pushAll(tmpNode.right);
        return tmpNode.key;
    }

    private void pushAll(Node node) {
        for (; node != null; stack.push(node), node = node.left);
    }
}
