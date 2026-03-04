package Assignments.Assignment1.module3;

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println("Sum of 2 numbers: " + obj.add(10, 20));
        System.out.println("Sum of 3 numbers: " + obj.add(5, 6, 7));
    }
}