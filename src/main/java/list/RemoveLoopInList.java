package list;

public class RemoveLoopInList {

    public static void removeLoop(Node head){

        Node fast = head.next;
        Node slow = head;

        while( fast!=slow )
        {
            if( fast==null || fast.next==null )
                return;

            fast = fast.next.next;
            slow = slow.next;
        }
        //both pointers now point to the same node in the loop.
        int size = 1;
        fast = fast.next;
        while( fast!=slow )
        {
            fast = fast.next;
            //incrementing the counter which stores length of loop..
            size+=1;
        }
        //updating the pointers again to starting node.
        slow = head;
        fast = head;

        //moving pointer (fast) by (size-1) nodes.
        for(int i=0; i<size-1; i++)
            fast = fast.next;

        while( fast.next != slow )
        {
            fast = fast.next;
            slow = slow.next;
        }
        //storing null in link part of the last node.
        fast.next = null;
    }
}
