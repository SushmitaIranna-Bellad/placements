package Threads.LambdaExp.WithOutLambda;
interface Calculator{
    int add(int a,int b);
}
public class Ex2withLambda {
    static void main(String[] args) {
        Calculator c=(a,b) -> a+b ;
        int result=c.add(10,30);
        System.out.println("result:"+result);
    }
}
