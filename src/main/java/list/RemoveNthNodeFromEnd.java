package list;

public class RemoveNthNodeFromEnd {

    public static Node removeNthLastNode(Node head, int n) {
        Node right = head;
        Node left = head;

        for (int i = 0; i < n; i++) {
            right = right.next;
        }

        if (right == null) {
            return head.next;
        }

        while (right.next != null) {
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;

        return head;
    }
}
