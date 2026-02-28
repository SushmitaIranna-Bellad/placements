package Threads.WaysOfCreatingThread.ThreadClass.Runnableinterface;
class MyTask implements Runnable{     //we us ethis when we need to make manytimes running  ultiple inheritance
//Here the MyThread wont come Because it is not a Thread That is task to be perform//
public void run(){
        System.out.println("Thread is Running");
    }
}

public class Demo {
    public static void main(String[] args) {
        MyTask obj=new MyTask();
        Thread T1=new Thread();
        Thread T2=new Thread();
        T1.start();
        T2.start();//instead of giving "t1.start()" we must create "Thread T2=new Thread();" bcz the "MyTask implements Runnable"
      //  is not a Thread it is task
    }
}
