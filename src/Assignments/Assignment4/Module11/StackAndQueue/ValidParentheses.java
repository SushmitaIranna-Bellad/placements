package Assignments.Assignment4.Module11.StackAndQueue;
// LeetCode 20 - Valid Parentheses
import java.util.*;
class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();
        System.out.println(obj.isValid("()"));   // true
        System.out.println(obj.isValid("([)]")); // false
    }
}

