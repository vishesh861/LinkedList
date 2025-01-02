package list;

public class RotateListClockwise {

    public Node rotate(Node head, int k) {

        Node ptr = head, ptr1 = null;
        int count = 0;

        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }

        int diff = count - k;
        ptr = head;
        while (diff-- > 0) {
            ptr1 = ptr;
            ptr = ptr.next;
        }

        ptr1.next = null;
        Node p = ptr;

        while (ptr.next != null) {
            ptr = ptr.next;
        }

        ptr.next = head;

        return p;
    }
}
