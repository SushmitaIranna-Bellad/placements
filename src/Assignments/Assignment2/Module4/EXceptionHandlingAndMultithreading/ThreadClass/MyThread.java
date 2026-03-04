package Assignments.Assignment2.Module4.EXceptionHandlingAndMultithreading.ThreadClass;


    class MyThread extends Thread {
        public void run() {
            System.out.println("Thread running via Thread class.");
        }
    }

    // Using Runnable interface
    class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Thread running via Runnable interface.");
        }
    }

    class ThreadDemo {
        public static void main(String[] args) {
            MyThread t1 = new MyThread();
            t1.start();

            Thread t2 = new Thread(new MyRunnable());
            t2.start();
        }
    }

