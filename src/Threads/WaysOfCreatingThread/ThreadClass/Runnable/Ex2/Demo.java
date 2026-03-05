package Threads.WaysOfCreatingThread.ThreadClass.Runnable.Ex2;
class MyThread extends Thread{
    public void run(){          //this run function is coming from runnable interface
        for(int i=1;i<=100;i++){
            System.out.println("Mythread"+i);
        }
    }
}
public class Demo {
    static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start(); //instead of start if we created run() then it will execute like normal thea it won't create thread
        for(int i=1;i<=100;i++) { //writing for loop writing thread inside main function
            System.out.println("Main Thread Running" + i);
        }

    }
}
//if we run this multiple times the output will change accordingly everytime there is no necessary of that mainthread will run first
//Thread has their own path of execution that which one will run first and which one will runs


/* strat() creates new thread
run() contain logic
Output Order is Unpredictable
Both Thread Run Independently
 */