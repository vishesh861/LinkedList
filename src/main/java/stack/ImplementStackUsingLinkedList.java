package stack;

class StackNode {

    int data;
    StackNode next;

    StackNode(int a) {
        data = a;
        next = null;
    }

}

public class ImplementStackUsingLinkedList {

    StackNode top;

    //Function to push an integer into the stack.
    void push(int a)
    {
        if (top == null)
        {
            top = new StackNode(a);
        }
        else
        {
            //creating a new temp node in the stack
            StackNode temp = new StackNode(a);
            //assigning link part of new node to top and making it top node.
            temp.next = top;
            top = temp;
        }
    }

    //Function to remove an item from top of the stack.
    int pop()
    {
        StackNode temp = top;

        //if node at temp pointer is null, the stack is empty so we return -1.
        if (temp == null)
        {
            return -1;
        }
        else
        {
            //storing the data at top node and deleting that node.
            temp = temp.next;
            int r = top.data;
            top = temp;

            //returning the data.
            return r;
        }
    }
}
