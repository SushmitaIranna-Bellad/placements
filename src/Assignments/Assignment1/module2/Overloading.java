package Assignments.Assignment1.module2;

public class Overloading {

        // Method 1
        public static int add(int a, int b) {
            return a + b;
        }

        // Method 2
        public static double add(double a, double b) {
            return a + b;
        }

        // Method 3
        public static int add(int a, int b, int c) {
            return a + b + c;
        }

        public static void main(String[] args) {

            System.out.println("Sum of two integers: " + add(10, 20));
            System.out.println("Sum of two doubles: " + add(5.5, 6.5));
            System.out.println("Sum of three integers: " + add(1, 2, 3));
        }
    }

