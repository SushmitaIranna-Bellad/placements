package Assignments.Assignment4.Module9.RecursionAndBackTracking;

// LeetCode 39 - Combination Sum
import java.util.*;
class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] candidates, int remain, int start) {
        if (remain == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= remain) {
                temp.add(candidates[i]);
                backtrack(res, temp, candidates, remain - candidates[i], i);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        CombinationSum obj = new CombinationSum();
        int[] candidates = {2,3,6,7};
        System.out.println(obj.combinationSum(candidates, 7));
    }
}
