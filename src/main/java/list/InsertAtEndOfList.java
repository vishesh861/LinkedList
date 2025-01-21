package list;

public class InsertAtEndOfList {

    public Node insertAtEndOfList(Node node, int n) {

        Node head = node;
        while (node.next != null) {
            node = node.next;
        }

        Node node1 = new Node(n);
        node.next = node1;
        node1.next = null;

        return head;
    }

}
