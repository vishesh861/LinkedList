package list;

public class NthNodeFromEnd {

    int getNthFromLast(Node head, int n)
    {
        //using two pointers, similar to finding middle element.
        Node currNode = head , nthNode = head;

        //traversing first n elements with first pointer.
        while(n!=0)
        {
            if(currNode==null)
                return -1;
            currNode = currNode.next;
            n--;
        }

        while(currNode!=null)
        {
            nthNode = nthNode.next;
            currNode = currNode.next;
        }

        //returning the data of nth node from end.
        if(nthNode!=null)
            return nthNode.data;
        else
            return -1;

    }
}
