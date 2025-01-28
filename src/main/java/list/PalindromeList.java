package list;

public class PalindromeList {

    public boolean isPalindrome(Node head) {

        Node slow = head; Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null; Node curr = slow;

        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        while(prev!=null){
            if(prev.data != head.data) {
                return false;
            }
            prev=prev.next;
            head=head.next;
        }

        return true;

    }

}
