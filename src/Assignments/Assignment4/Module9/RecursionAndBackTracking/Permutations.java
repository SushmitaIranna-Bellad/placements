package Assignments.Assignment4.Module9.RecursionAndBackTracking;
// LeetCode 46 - Permutations
import java.util.*;
class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }
    private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, boolean[] used) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            temp.add(nums[i]);
            backtrack(res, temp, nums, used);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        Permutations obj = new Permutations();
        int[] nums = {1,2,3};
        System.out.println(obj.permute(nums));
    }
}

