package Threads.LambdaExp.WithOutLambda.WithRunnableInterface.OldWay;


//class MyTask implements Runnable {
  //  public void run() {
    //    for (int i = 1; i <= 5; i++) {
      //      System.out.println("MyThread" + i);
        //}
    //}
//}
       public class Demo {
         public static void main(String[] args) {
              //  MyTask obj=new MyTask1();
                Thread t1=new Thread(new Runnable(){
                    public void run(){
                        System.out.println("MyTask1 is Running");
                    }
                });//thread1
             Thread t2=new Thread(new Runnable(){
                 public void run(){
                     System.out.println("MyTask2 Is Running");
                 }
             });
                t1.start();
                t2.start();
            }
    }