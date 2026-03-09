package RecursionAndBackTracking;
//sum of natural numbers with using loops

public class SumOfNNatural {
    static void main(String[] args) {
        int num=10;
        int sum=0;
        for(int i=1;i<=num;i++){
            sum = sum + i;
        }
        System.out.println("sum is: "+sum);
    }
}
