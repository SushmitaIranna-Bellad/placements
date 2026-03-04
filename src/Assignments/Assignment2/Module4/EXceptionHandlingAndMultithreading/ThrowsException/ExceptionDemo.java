package Assignments.Assignment2.Module4.EXceptionHandlingAndMultithreading.ThrowsException;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) {

        // Unchecked
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e);
        }

        // Checked
        try {
            FileReader fr = new FileReader("abc.txt");
        } catch (IOException e) {
            System.out.println("Checked Exception: " + e);
        }
    }

}
