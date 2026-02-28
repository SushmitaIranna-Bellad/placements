package ExceptionHandling;

public class E1 {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 10;
        j = 2;
        try {
            k = i / j;
            int[] arr = {0, 1, 2, 3, 4, 5};
            System.out.println(arr[10]);
        } catch (ArithmeticException e)//if we know which type of exception it is then we need to give that only instead of only giving exception
        {
            System.out.println("Undefined");
        } catch (ArrayIndexOutOfBoundsException e)//
        {
            System.out.println("Invalid Index");
        } catch (Exception e) {
            System.out.println("Unknown Exception Occured");
        } finally {
            System.out.println("Hello");
        }
    }
    static{
        System.out.println("Execution starts!");//this one will execute first even though it is in out of main function
    }

}

