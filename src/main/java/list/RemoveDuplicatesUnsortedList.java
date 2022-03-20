package list;

import java.util.HashSet;

public class RemoveDuplicatesUnsortedList {

    public Node removeDuplicates(Node head)
    {
        //using set to store already seen values in list.
        HashSet<Integer> hs = new HashSet<>();

        //using two pointers one of which stores first node other null.
        Node current = head;
        Node prev = null;

        while (current != null)
        {
            int curval = current.data;

            if (hs.contains(curval)) {
                prev.next = current.next;
                current=null;
            }
            //else we just insert the data at current node in set and update
            //prev to the current node.
            else {
                hs.add(curval);
                prev = current;
            }
            //updating current to the next node of prev.
            current = prev.next;
        }
        return head;
    }
}
