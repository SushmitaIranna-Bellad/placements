package Threads.LambdaExp.WithLambda.Ex2;
interface Calculator{//interface class
    int add(int a,int b); //abstract method
}
public class Demo {
    static void main(String[] args) {
        Calculator c=new Calculator() {
            public int add(int a, int b) {
                return a+b;
            }
        };
        int result=c.add(10,20);
        System.out.println("Result:"+result);
    }
}

