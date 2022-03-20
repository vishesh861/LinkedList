package list;

public class ReverseKGroups {

    public Node reverseKGroup(Node head, int k) {
        Node begin;
        if (head==null || head.next ==null || k==1)
            return head;
        Node dummyhead = new Node(-1);
        dummyhead.next = head;
        begin = dummyhead;
        int i=0;
        while (head != null){
            i++;
            if (i%k == 0){
                begin = reverse(begin, head.next);
                head = begin.next;
            } else {
                head = head.next;
            }
        }
        return dummyhead.next;

    }

    public Node reverse(Node begin, Node end){
        Node curr = begin.next;
        Node next, first;
        Node prev = begin;
        first = curr;
        while (curr!=end){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        begin.next = prev;
        first.next = curr;
        return first;
    }
}
