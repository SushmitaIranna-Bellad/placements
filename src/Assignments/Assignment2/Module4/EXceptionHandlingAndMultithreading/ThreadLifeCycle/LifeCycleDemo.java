package Assignments.Assignment2.Module4.EXceptionHandlingAndMultithreading.ThreadLifeCycle;


    class LifeCycleDemo extends Thread {
        public void run() {
            System.out.println("Thread is running...");
            try { Thread.sleep(500); } catch (Exception e) {}
            System.out.println("Thread finished.");
        }

        public static void main(String[] args) throws InterruptedException {
            LifeCycleDemo t = new LifeCycleDemo();
            System.out.println("State before start: " + t.getState());
            t.start();
            System.out.println("State after start: " + t.getState());
            Thread.sleep(100);
            System.out.println("State while running: " + t.getState());
            t.join();
            System.out.println("State after completion: " + t.getState());
        }
    }

