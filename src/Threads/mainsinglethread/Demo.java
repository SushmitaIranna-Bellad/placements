package Threads.mainsinglethread;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Main Thread started!");
        for(int i=0;i<5;i++){
            System.out.println("MainThread"+i);
        }
        System.out.println("MainThread is stopped!");
    }
}//this is for telling that Main is Thread or How MainThread is working
