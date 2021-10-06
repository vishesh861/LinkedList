package arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(ListNode node : lists){
            while(node != null){
                pq.add(node.val);
                node = node.next;
            }
        }
        if(pq.isEmpty()){
            return null;
        }
        ListNode head = new ListNode(pq.poll());
        ListNode prev = head;
        while(!pq.isEmpty()){
            ListNode current = new ListNode(pq.poll());
            prev.next = current;
            prev = current;
        }
        return head;
    }
}
