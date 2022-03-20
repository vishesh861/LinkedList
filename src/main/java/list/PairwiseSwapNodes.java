package list;

public class PairwiseSwapNodes {

    public static Node pairwise_swap(Node head)
    {
        if (head== null || head.next == null) {
            return head;
        }

        //initializing previous and current pointers.
        Node prev = head;
        Node curr = head.next;

        head = curr;

        // Traverse the list
        while (true) {

            //creating a next pointer as well.
            Node next = curr.next;
            //updating next of current as prev to swap current and previous node.
            curr.next = prev;

            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }

            prev.next = next.next;

            //updating prev and curr pointers.
            prev = next;
            curr = prev.next;
        }
        return head;
    }
}
