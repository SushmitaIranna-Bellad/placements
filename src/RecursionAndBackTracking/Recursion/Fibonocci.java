package RecursionAndBackTracking.Recursion;

public class Fibonocci {
    static int fib(int x){
        if(x==0||x==1){
            return x;
        }
        else{
           return  fib(x-1)+(x-2);
        }
    }
    static void main(String[] args) {
        int n=100;
        for(int i=0;i<=n;i++){
            System.out.print(fib(i) + " ");
        }
    }
}
