package Threads.Synchronization.WithOutSync;
class Counter{
    int count=0;
     synchronized void increment(){
        count++;
    }
}
public class Demo {
    static void main(String[] args) {
        Counter c = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join(); //it throws an InterruptException by default to handle that exception we wrote it in try
        }catch(Exception e){}
        System.out.println("count = "+ c.count);
    }
}
