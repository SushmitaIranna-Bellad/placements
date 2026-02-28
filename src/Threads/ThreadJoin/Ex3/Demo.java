package Threads.ThreadJoin.Ex3;
class MyThread extends Thread{
        Thread other;
        MyThread(Thread other){ //constructor
            this.other=other;
        }
        public void run(){
            try{
                if(other!=null){
                    other.join();
                }
            }catch(Exception e){}
            System.out.println(Thread.currentThread().getName()+"Finished");
    }
}
public class Demo {
    static void main(String[] args) {
        MyThread t1=new MyThread(null);
        MyThread t2=new MyThread(t1);
        t1.start();

    }
}
// This is so called join with multiple Threads
