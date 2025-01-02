package list;

public class RotateListAntiClockwise {

    public Node rotate(Node head, int k) {
        Node ptr = head, ptr1 = null;
        while (k-- > 0 && ptr != null) {

            ptr1 = ptr;
            ptr = ptr.next;

        }

        ptr1.next = null;
        Node pt = ptr;

        while (ptr.next != null) {
            ptr = ptr.next;
        }

        ptr.next = head;
        return pt;
    }
}
