package list;

public class Add1ToTheGivenList {

    public Node add1ToGivenList(Node node) {

        Node node1 = reverseList(node);
        Node head = node1;
        int carry = 0;
        while (node1 != null) {
            if (node1.data != 9) {
                node1.data += 1;
                if (carry == 1) {
                    carry = 0;
                }
                break;
            } else {
                if(node1.next == null) {
                    Node n = new Node(1);
                    node1.next = n;
                    n.next = null;
                    node1.data = 0;
                    break;
                }
                node1.data = 0;
                carry = 1;
                node1 = node1.next;
            }
        }

        return reverseList(head);

    }

    private Node reverseList(Node head) {

        if(head == null)
            return null;

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
