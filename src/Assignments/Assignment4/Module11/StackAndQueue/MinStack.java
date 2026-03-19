package Assignments.Assignment4.Module11.StackAndQueue;
// LeetCode 155 - Min Stack
import java.util.*;
class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) minStack.push(val);
    }
    public void pop() {
        if (stack.pop().equals(minStack.peek())) minStack.pop();
    }
    public int top() { return stack.peek(); }
    public int getMin() { return minStack.peek(); }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(3); ms.push(5); ms.push(2);
        System.out.println("Min: " + ms.getMin()); // 2
        ms.pop();
        System.out.println("Top: " + ms.top());    // 5
    }
}

