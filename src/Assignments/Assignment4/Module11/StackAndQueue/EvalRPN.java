package Assignments.Assignment4.Module11.StackAndQueue;
// LeetCode 150 - Evaluate Reverse Polish Notation
import java.util.*;
class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String t : tokens) {
            if ("+-*/".contains(t)) {
                int b = stack.pop(), a = stack.pop();
                switch (t) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            } else stack.push(Integer.parseInt(t));
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        EvalRPN obj = new EvalRPN();
        String[] tokens = {"2","1","+","3","*"};
        System.out.println("Result: " + obj.evalRPN(tokens)); // 9
    }
}
