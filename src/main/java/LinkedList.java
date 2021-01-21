public class LinkedList {

    public Node start;

    public void insertIntoEmptyList(int data) {
        Node node = new Node ();
        node.setData(data);
        node.setNextNode(start);
        start = node;

    }

    public void insertAtTop(int data) {
        Node node = new Node ();
        node.setData(data);
        node.setNextNode(start);
        start = node;

    }

    public void insertAtEnd(int data) {
        Node node = new Node();
        node.setData(data);
        Node current = start;
        while (current.getNextNode() != null) {
            current = current.getNextNode();
        }
        current.setNextNode(node);
        node.setNextNode(null);
    }

    public void insertAtPositionAfter(int data, int item) {
        Node node = new Node();
        node.setData(data);
        Node current = start;
        while (current.getData() != item) {
            current = current.getNextNode();
        }
        node.setNextNode(current.getNextNode());
        current.setNextNode(node);
    }

    public void insertAtPositionBefore(int data, int item) {
        Node node = new Node();
        node.setData(data);
        Node current = start;
        while (current.getNextNode() != null) {
            if (current.getNextNode().getData() == item) {
                node.setNextNode(current.getNextNode());
                current.setNextNode(node);
                break;
            }
           current = current.getNextNode();
        }
    }

    public void deleteFirstNode() {
        Node tmp = start;
        start = start.getNextNode();
    }

    public void deleteSpecificNode(int data) {
        Node p = start;
        while (p.getNextNode() != null) {
            if (p.getNextNode().getData() == data) {
                Node tmp = p.getNextNode();
                p.setNextNode(tmp.getNextNode());
            }
            p = p.getNextNode();
        }
    }

    public void deleteFromEnd() {
        if (start == null) {
            System.out.println("List is Empty");
        }
        Node p = start;
        while (p.getNextNode().getNextNode() != null) {
            p = p.getNextNode();
        }
        p.setNextNode(p.getNextNode().getNextNode());
    }

   public void reverseList() {
       Node ptr;
       Node previousNode;
       Node nextNode;
       previousNode = null;
       ptr = start;
       while (ptr != null) {
           nextNode = ptr.getNextNode();
           ptr.setNextNode(previousNode);
           previousNode = ptr;
           ptr = nextNode;
       }
       start = previousNode;
   }

    @Override
    public String toString() {
        String result = "{";
        Node current = start;

        while (current != null) {
            result += current.toString();
            current = current.getNextNode();
        }

        result += "}";
        return result;
    }
}
