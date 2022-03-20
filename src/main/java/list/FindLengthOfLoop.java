package list;

public class FindLengthOfLoop {

    static int countNodesinLoop(Node head)
    {
        Node fast = head.next;
        Node slow = head;

        while( fast!=slow )
        {
            if( fast==null || fast.next==null )
                return 0;

            fast = fast.next.next;
            slow = slow.next;
        }

        int size = 1;
        fast = fast.next;

        while( fast!=slow )
        {
            fast = fast.next;
            size+=1;
        }
        return size;
    }
}
