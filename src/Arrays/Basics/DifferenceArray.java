package Arrays.Basics;

public class DifferenceArray {
    static void main(String[] args) {
        int n=5;
        int[] diff=new int[n];
        int L=1;
        int R=3;
        int val=5;
        diff[L] +=val;
        if(R+1<n) {
            diff[R + 1] -= val;//we will use this when r is the last index there is no R+1 otherwise we will use directly diff[R+1]
        }
        //take out the prefix su
        for(int i=1;i<n;i++){
            diff[i]=diff[i]+diff[i-1];
        }
        System.out.println("Result");
        for(int i=1;i<n;i++){
            System.out.println(diff[i]+" ");
        }
    }
}
