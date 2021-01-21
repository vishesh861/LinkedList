public class Node {

    private int data;

    public Node(int data) {
        this.data = data;
    }

    private Node nextNode;

    public Node() {

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + this.data +
                '}';
    }
}
