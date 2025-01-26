package list;

public class RemoveAllNodesWithGivenValue {

    public Node removeAllNodesWithGivenValue(Node node, int val) {
        Node temp = new Node(0) , curr = temp;
        temp.next = node;
        while(curr.next != null ) {
            if(curr.next.data == val)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return temp.next;
    }

}
