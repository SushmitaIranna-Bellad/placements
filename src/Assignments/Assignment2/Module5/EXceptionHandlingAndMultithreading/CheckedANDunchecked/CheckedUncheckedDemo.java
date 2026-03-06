package Assignments.Assignment2.Module5.EXceptionHandlingAndMultithreading.CheckedANDunchecked;
class CheckedUncheckedDemo {
    public static void main(String[] args) {
        // Unchecked Exception (Runtime)
        try {
            int a = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e);
        }

        // Checked Exception (Compile-time)
        try {
            java.io.FileReader fr = new java.io.FileReader("file.txt"); // FileNotFoundException
        } catch (java.io.IOException e) {
            System.out.println("Checked Exception: " + e);
        }
    }
}
