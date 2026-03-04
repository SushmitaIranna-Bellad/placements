package Assignments.Assignment1.module1;

public class sumofevennumbers {
    public static void main(String[] args){
        int i=1;
        int sum=0;
        while(i<=100){
            if(i%2==0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println("sum of even numbers between 1 and 100 is:"+sum);
    }
}
