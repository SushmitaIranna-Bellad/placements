package Assignments.Assignment4.Module8.StringHashingBitManipulationAndCollection;
// LeetCode 191 - Number of 1 Bits
class NumberOfBits {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n >>>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfBits obj = new NumberOfBits();
        System.out.println(obj.hammingWeight(11)); // 3 (binary 1011)
    }
}

