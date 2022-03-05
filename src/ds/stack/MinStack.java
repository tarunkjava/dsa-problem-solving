package ds.stack;

import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        Solution stack = new Solution();
        stack.push(1);
        stack.push(2);
        stack.push(-2);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        System.out.println(stack.top());
    }
}

class Solution {
    private Stack< Integer > stack;
    private Stack < Integer > minStack;

    public Solution() {
        stack = new Stack < > ();
        minStack = new Stack < > ();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty())
            minStack.push(x);
        else if (x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty())
            return;
        int num = stack.pop();
        if (num == minStack.peek())
            minStack.pop();
    }

    public int top() {
        if (stack.isEmpty())
            return -1;

        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty())
            return -1;

        return minStack.peek();
    }
}
