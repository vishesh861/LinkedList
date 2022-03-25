package stack;

public class ImplementStackUsingArray {

    int top;
    int arr[] = new int[1000];

    ImplementStackUsingArray()
    {
        top = -1;
    }

    //Function to push an integer into the stack.
    void push(int a)
    {
        //increasing the top pointer and pushing the integer at that position.
        top += 1;
        int max_position = top;
        arr[max_position] = a;
    }

    //Function to remove an item from top of the stack.
    int pop()
    {
        //if stack is empty, we return -1 else we return the top element.
        if (top == -1)
            return -1;
        else
        {
            int max_to_return = top;
            int to_return = arr[max_to_return];
            top -= 1;
            return to_return;
        }
    }
}
