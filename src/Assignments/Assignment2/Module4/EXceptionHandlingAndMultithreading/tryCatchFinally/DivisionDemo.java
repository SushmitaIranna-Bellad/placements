package Assignments.Assignment2.Module4.EXceptionHandlingAndMultithreading.tryCatchFinally;

    class DivisionDemo {
        public static void main(String[] args) {
            try {
                int result = 10 / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero!");
            } finally {
                System.out.println("Finally block executed.");
            }
        }
    }
