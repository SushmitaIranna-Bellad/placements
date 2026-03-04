
       package Assignments.Assignment1.module3;

    public class Parent {

        void show() {
            System.out.println("Parent class method");
        }

        public static void main(String[] args) {

            Parent p = new Parent();
            p.show();

            Parent c = new Child();   // Polymorphism
            c.show();
        }
    }

    class Child extends Parent {

        @Override
        void show() {
            System.out.println("Child class method");
        }
    }
