package Assignments.Assignment4.Module11.StackAndQueue;
// LeetCode 232 - Implement Queue using Stacks
import java.util.*;
class MyQueue {
    private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();

    public void push(int x) { in.push(x); }
    public int pop() { peek(); return out.pop(); }
    public int peek() {
        if (out.isEmpty()) while (!in.isEmpty()) out.push(in.pop());
        return out.peek();
    }
    public boolean empty() { return in.isEmpty() && out.isEmpty(); }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(10); q.push(20);
        System.out.println(q.peek()); // 10
        System.out.println(q.pop());  // 10
        System.out.println(q.empty()); // false
    }
}

