public class RotateList {

    public Node1 rotate(Node1 head, int k) {
        Node1 ptr = head, ptr1 = null;
        while (k-- > 0 && ptr != null) {

            ptr1 = ptr;
            ptr = ptr.next;

        }

        ptr1.next = null;
        Node1 pt = ptr;

        while (ptr.next != null) {
            ptr = ptr.next;
        }

        ptr.next = head;
        return pt;
    }
}
