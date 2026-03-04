package Assignments.Assignment1.module3;

public class Shape{
        void draw() {
            System.out.println("Drawing a shape");
        }
    }

    class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }

    class PolymorphismDemo {
        public static void main(String[] args) {

            Shape s;

            s = new Circle();
            s.draw();

            s = new Rectangle();
            s.draw();
        }
    }

