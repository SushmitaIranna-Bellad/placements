package Arrays.Basics;

public class PrefixSum {
    static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int prefix[]=new int[arr.length];
        //first element remains the same
        prefix[0]=arr[0];
        //Build prefix array
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        //print the result
       for(int i=0;i<arr.length;i++){
           System.out.println(prefix[i] + " " );
       }
       //------------------Prefix Sum Over-----------------//
        int L=1;
        int R=3;
        int sum;
        if(L==0){
            sum=prefix[R];
        }else{
            sum=prefix[R]-prefix[L-1];
        }
        sum=prefix[R]-prefix[L-1];
        System.out.println("sum of range between index 1 to 3:"+sum);
    //-----------------prefix sum over range----------------//
    }
}
