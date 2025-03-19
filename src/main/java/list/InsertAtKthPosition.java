package list;

public class InsertAtKthPosition {

    static Node insertPos(Node head, int kth, int key) {

        if (kth < 1)
            return head;

        if (kth == 1) {
            Node newNode = new Node(key);
            newNode.next = head;
            return newNode;
        }
        Node curr = head;
        for (int i = 1; i < kth - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null)
            return head;

        Node newNode = new Node(key);

        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }
}
