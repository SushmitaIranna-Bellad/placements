package ExceptionHandling;

public class E3BankExample {//example related to throw function

    public static void main(String[] args) {
        try{
            int Balance=2000;
            int withdraw=3000;
            if(withdraw > Balance){
                throw new ArithmeticException("Insufficient Balance");
            }
            System.out.println("WithDraw Successful");
        }catch(ArithmeticException e) //that throw is caught here it prints the message that insufficient balance
         {
            System.out.println("Exception Caught:"+ e.getMessage());
        }
    }
}
