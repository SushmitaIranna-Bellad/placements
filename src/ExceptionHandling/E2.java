package ExceptionHandling;

public class E2 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=2;
        try{
            k=i/j;
            int[] arr={1,2,3,4,5};
            System.out.println(k);
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e)//we will write this when we are lazy about to write many catch function we can use it
        {
            System.out.println(e);
        }
        System.out.println("Hello");
    }
}
