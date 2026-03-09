package RecursionAndBackTracking.Recursion;
//Iterative Way
public class SumOfNatural {
    static int sum(int x){
        //base case
        if(x==1){
            return 1;
        }
        else{
            return x+sum(x-1);//recursive case
        }
    }

    static void main(String[] args) {
        int num=10;
        int result=sum(num);
        System.out.println(result);
    }
}
