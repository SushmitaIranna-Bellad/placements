package ExceptionHandling;

public class E3 {
   static void checkAge(int age){
        if(age>=18){
            System.out.println("Eligible-Access Granted!");
        }else{
            throw new RuntimeException("Not Eligible-Access");//we can throw anything using throw keyword even we can throw method exception and also object class also
        }//here we are not handling the exception intentionally throwing an exception
    }//if we entered wrong passward it is asking for reentered passward itwont deduct money
    public static void main(String[] args) {
        // checkAge(12);
        checkAge(25);
    }
}
