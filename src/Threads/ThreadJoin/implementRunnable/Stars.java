package Threads.ThreadJoin.implementRunnable;
class MyThread implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("MyThread" +i);
        }
    }
}
public class Stars {
    static void main(String[] args) throws Exception  {
        MyThread obj=new MyThread();
        Thread t1=new Thread(obj);
        t1.start();
        t1.join();
        System.out.println("Main Thread is running");
    }
}
