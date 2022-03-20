package list;

public class ReverseList {

    Node reverseList(Node head)
    {
        if(head == null)
            return null;

        //taking three pointers to store the current, previous and next nodes.
        Node prev = null;
        Node current = head;
        Node next = current.next;

        while(current!=null)
        {
            //taking the next node as next.
            next=current.next;

            //storing the previous node in link part of current node.
            current.next=prev;

            //updating prev from previous node to current node.
            prev=current;

            //updating current node to next node.
            current =next;
        }

        return prev;
    }
}
