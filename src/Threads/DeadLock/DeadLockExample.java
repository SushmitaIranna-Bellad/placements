package Threads.DeadLock;

public class DeadLockExample {
    static void main(String[] args) {
        Object lock1=new Object();
            Object lock2=new Object();
            Thread t1=new Thread(() ->{
                synchronized (lock1) {//this particular thread told that to acquire first lock
                    System.out.println("Thread 1 locked lock1");

                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                        synchronized (lock2) {
                            System.out.println("Thread 1 is waiting for lock2");
                    }
                }
            });
        Thread t2=new Thread(() ->{
            synchronized (lock2) {   //this particular thread told that to acquire first lock
                System.out.println("Thread 2 locked lock1");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    synchronized (lock1) {
                        System.out.println("Thread 1 is waiting for lock1");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
//this condition will called Deadlock