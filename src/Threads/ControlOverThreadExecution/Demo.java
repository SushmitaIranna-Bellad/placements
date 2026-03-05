package Threads.ControlOverThreadExecution;
class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Child:"+i);
            try{
                Thread.sleep(1000);//this sleep will work like it will give the output slowly according to the time if it give first child 1 and after 1000 milli seconds child2 will execute
            }catch(Exception e){}
        }//if we remove catch it will throw interrupted exception
    }
}
public class Demo {
    static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
    }
}
//to control this we introduced to .sleep() but it gave error
//now he thread will sleep at mentioned time then it will execute next
//join in thread it will make usually the main function will execute first but when we used the join the main function wait for another thread to execute and then main thread will execute