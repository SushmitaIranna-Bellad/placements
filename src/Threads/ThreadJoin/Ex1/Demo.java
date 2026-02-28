package Threads.ThreadJoin.Ex1;
class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child:"+i);
        }
    }

}
public class Demo {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        t1.start();
        try{
            t1.join();
        }catch(Exception e){}

            System.out.println("Main Thread finished! ");

    }
}
