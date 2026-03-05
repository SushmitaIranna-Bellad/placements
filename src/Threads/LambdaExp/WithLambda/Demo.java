package Threads.LambdaExp.WithLambda;

interface Greeting{
    void sayHello();
}


public class Demo {
    static void main(String[] args) {
        Greeting g = () -> { //this line is lambda function
            // this () it represent parameters of that function
            // -> this is anonoumous function operator

            System.out.println("Hello world");
        };//anonomous classes can be closed here so we use semiclon here here that class is closed that is the syntax of writing
        g.sayHello();
    }
}