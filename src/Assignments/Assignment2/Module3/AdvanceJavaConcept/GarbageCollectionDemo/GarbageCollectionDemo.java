package Assignments.Assignment2.Module3.AdvanceJavaConcept.GarbageCollectionDemo;


    public class GarbageCollectionDemo {

        // A simple class with a finalize method
        static class DemoObject {
            int id;

            DemoObject(int id) {
                this.id = id;
            }

            // finalize() is called by GC before object is removed
            @Override
            protected void finalize() throws Throwable {
                System.out.println("Garbage Collector is reclaiming object with id: " + id);
            }
        }

        public static void main(String[] args) {
            // Creating objects
            DemoObject obj1 = new DemoObject(1);
            DemoObject obj2 = new DemoObject(2);

            // Making objects eligible for GC
            obj1 = null;
            obj2 = null;

            // Requesting JVM to run Garbage Collector
            System.out.println("Requesting Garbage Collection...");
            System.gc();

            // Adding a delay so GC has time to run
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("End of main method.");
        }
    }

