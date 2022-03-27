class ListNode {

    private int data;
    private ListNode nextListNode;

    public ListNode(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNextListNode() {
        return nextListNode;
    }

    public void setNextListNode(ListNode nextListNode) {
        this.nextListNode = nextListNode;
    }
}

public class MyLinkedList {

    private ListNode head;

    public MyLinkedList(){
    }

    public void insert(int data){
        ListNode newListNode = new ListNode(data);
        if(this.head == null){
            head = newListNode;
        }else {
            ListNode currentListNode = head;
            while(currentListNode.getNextListNode() != null){
                currentListNode = currentListNode.getNextListNode();
            }
            currentListNode.setNextListNode(newListNode);
        }
    }

    public void insertHead(int data){
        ListNode newListNode = new ListNode(data);
        newListNode.setNextListNode(head);
        head = newListNode;
    }

    public void insertAt(int index, int data){
        ListNode ListNodeToBeInserted = new ListNode(data);
        ListNode ListNode = head;
        for(int i = 0; i< index -1; i++){
            ListNode = ListNode.getNextListNode();
        }
        ListNodeToBeInserted.setNextListNode(ListNode.getNextListNode());
        ListNode.setNextListNode(ListNodeToBeInserted);
    }

    public void deleteListNodeAt(int index){
        ListNode ListNode = head;
        for(int i = 0; i< index -1; i++){
            ListNode = ListNode.getNextListNode();
        }
        ListNode.setNextListNode(ListNode.getNextListNode().getNextListNode());
    }

    public void display(){
        if(head != null){
            ListNode currentListNode = head;
            while(currentListNode.getNextListNode() != null){
                System.out.println(currentListNode.getData());
                currentListNode = currentListNode.getNextListNode();
            }
            System.out.println(currentListNode.getData());
        }
    }

}
