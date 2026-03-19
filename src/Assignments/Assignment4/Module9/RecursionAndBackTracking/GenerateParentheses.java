package Assignments.Assignment4.Module9.RecursionAndBackTracking;
// LeetCode 22 - Generate Parentheses
import java.util.*;
class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }
    private void backtrack(List<String> res, String curr, int open, int close, int max) {
        if (curr.length() == max * 2) {
            res.add(curr);
            return;
        }
        if (open < max) backtrack(res, curr + "(", open + 1, close, max);
        if (close < open) backtrack(res, curr + ")", open, close + 1, max);
    }

    public static void main(String[] args){
        GenerateParentheses obj = new GenerateParentheses();
        List<String> result = obj.generateParenthesis(3);
        System.out.println("Generated Parentheses for n=3:");
        for (String s : result) {
            System.out.println(s);
        }
    }
}


