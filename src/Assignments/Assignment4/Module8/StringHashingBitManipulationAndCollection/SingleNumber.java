package Assignments.Assignment4.Module8.StringHashingBitManipulationAndCollection;
// LeetCode 136 - Single Number
class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) result ^= n;
        return result;
    }

    public static void main(String[] args) {
        SingleNumber obj = new SingleNumber();
        int[] arr = {4,1,2,1,2};
        System.out.println(obj.singleNumber(arr)); // 4
    }
}
