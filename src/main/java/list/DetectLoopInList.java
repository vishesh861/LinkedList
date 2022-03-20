package list;

public class DetectLoopInList {

    public boolean detectLoop(Node head){

        Node fast = head.next;
        Node slow = head;

        while( fast != slow)
        {
            if( fast==null || fast.next==null)
                return false;

            fast=fast.next.next;
            slow=slow.next;
        }
        return true;
    }
}
