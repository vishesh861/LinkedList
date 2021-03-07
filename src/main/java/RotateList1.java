public class RotateList1 {

    public Node1 rotate(Node1 head, int k) {

        Node1 ptr = head, ptr1 = null;
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
        Node1 p = ptr;

        while (ptr.next != null) {
            ptr = ptr.next;
        }

        ptr.next = head;

        return p;
    }
}
