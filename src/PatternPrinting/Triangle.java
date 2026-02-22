package PatternPrinting;

public class Triangle {
    public static void main(String[] args) {
        for (int i =0; i <5; i++) {

            for (int space =0; space <5-i-1; space++) {
                System.out.print(" ");
            }
            for (int stars =0; stars <2*i+1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =5-2; i>=0; i--) {

            for (int space =0; space <5-i-1; space++) {
                System.out.print(" ");
            }
            for (int stars =0; stars <2*i+1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
