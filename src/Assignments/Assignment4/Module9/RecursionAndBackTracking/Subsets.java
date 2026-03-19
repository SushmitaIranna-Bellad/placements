package Assignments.Assignment4.Module9.RecursionAndBackTracking;
// LeetCode 78 - Subsets
import java.util.*;
class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) {
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        Subsets obj = new Subsets();
        int[] nums = {1,2,3};
        System.out.println(obj.subsets(nums));
    }
}

