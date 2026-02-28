package Threads.ThreadJoin.Ex2;

class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child:"+i);
        }
    }

}
public class Stores {
    public static void main(String[] args) throws Exception{
        MyThread t1 = new MyThread();
        t1.start();
        t1.join();

        System.out.println("Main Thread finished! ");

    }
}

