package Threads.LambdaExp.WithRunnableInterface.NewWay;

public class Demo {
    static void main(String[] args) {
        Thread t1= new Thread(()-> System.out.println("Thread is Running"));
        Thread t2=new Thread(()-> {
            for(int i=0;i<=5;i++){
                System.out.println("MyTask is Running"+i);
            }
        });
        t1.start();
        t2.start();
    }
}
