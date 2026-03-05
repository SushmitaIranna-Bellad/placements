package Threads.LambdaExp.WithOutLambda;
interface Greeting{
    void sayHello();
    }


public class Demo {
    static void main(String[] args) {
        Greeting g = new Greeting() {
            //@overriding the same annotation(method)
            public void sayHello() {
                System.out.println("Hello world");
            }
        };
        g.sayHello();
    }
}
