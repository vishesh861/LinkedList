package list;

import java.util.PriorityQueue;

public class MergeKSortedLists {

    public Node mergeKLists(Node[] lists) {
        if(lists.length == 0)
            return null;
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(Node node : lists){
            while(node != null){
                pq.add(node.data);
                node = node.next;
            }
        }
        if(pq.isEmpty()){
            return null;
        }
        Node head = new Node(pq.poll());
        Node prev = head;
        while(!pq.isEmpty()){
            Node current = new Node(pq.poll());
            prev.next = current;
            prev = current;
        }
        return head;
    }
}
