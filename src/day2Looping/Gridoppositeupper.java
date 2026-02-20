package day2Looping;

public class Gridoppositeupper {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            for (int space = 2 * i; space < 2 * 5; space++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
