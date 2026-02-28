package Threads.WaysOfCreatingThread.ThreadClass.Runnable.Ex1;
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is Running");
    }                                                   //thi whole is one Thread
}

public class Demo {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start(); //this start will make thread and start running if we given that as run() then it will run the code as normal thread
    }
    //this is another Thread
}

//this is example of multithread example