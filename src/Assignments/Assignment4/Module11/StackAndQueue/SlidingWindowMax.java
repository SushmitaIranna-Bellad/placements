package Assignments.Assignment4.Module11.StackAndQueue;
// LeetCode 239 - Sliding Window Maximum
import java.util.*;

class SlidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0];
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> dq = new ArrayDeque<>(); // stores indices

        for (int i = 0; i < nums.length; i++) {
            // Remove indices outside the current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            // Remove smaller values from the back
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);

            // Record max for the current window
            if (i >= k - 1) {
                res[i - k + 1] = nums[dq.peekFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SlidingWindowMax obj = new SlidingWindowMax();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = obj.maxSlidingWindow(nums, k);

        System.out.print("Sliding Window Maximums: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        // Expected Output: 3 3 5 5 6 7
    }
}

