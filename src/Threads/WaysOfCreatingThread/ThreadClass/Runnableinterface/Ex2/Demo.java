package Threads.WaysOfCreatingThread.ThreadClass.Runnableinterface.Ex2;
class MyTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyThread" + i);
        }
    }
}
        public class Demo {
            public static void main(String[] args) {
                MyTask obj=new MyTask();
                Thread t1=new Thread();
                t1.start();
            }
    }


