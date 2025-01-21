package list;

public class InsertAtBeginningOfList {

    public Node insertAtBeginningOfList(Node node, int n) {

        Node node1 = new Node(n);
        node1.next = node;

        return node1;
    }

}
