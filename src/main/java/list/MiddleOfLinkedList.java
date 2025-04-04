package list;

public class MiddleOfLinkedList {

    public Node middleNode(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null && slow!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
