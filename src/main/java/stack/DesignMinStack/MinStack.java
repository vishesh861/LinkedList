package stack.DesignMinStack;

public class MinStack {

        int maxSize;
        static MainStack<Integer> mainStack;

        MainStack<Integer> minStack;

        // constructor
        public MinStack() {
            this.maxSize = 1000;
            mainStack = new MainStack<>(maxSize);
            minStack = new MainStack<>(maxSize);
        }

        // Pop() removes and returns value from minStack
        public int pop() {
            minStack.pop();
            return mainStack.pop();
        }

        // Pushes values into min_stack
        public void push(Integer value) {
            mainStack.push(value);
            if (!minStack.isEmpty() && minStack.top()<value) {
                minStack.push(minStack.top());
            } else {
                minStack.push(value);
            }

        }

        //returns minimum value in O(1)
        public int minNumber() {
            return minStack.top();
        }

        public static void main(String args[]) {
            MinStack m = new MinStack();
            m.push(2);
            m.push(10);
            m.pop();
            m.push(-3);
            m.push(4);
            m.push(1);

            System.out.println(m.minNumber());
        }
    }


