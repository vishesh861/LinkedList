package stack;

import java.util.LinkedList;

public class ImplementStackUsingQueue {
    private LinkedList<Integer> q1 = new LinkedList<>();

    public ImplementStackUsingQueue() {

    }

    public void push(int x) {
        q1.add(x);
        int sz = q1.size();
        while (sz > 1) {
            q1.add(q1.remove());
            sz--;
        }
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
