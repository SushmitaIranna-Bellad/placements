package ExceptionHandling;

public class ThrowableDemo {
    static void function() throws Throwable {
        throw new Throwable("something went wrong");
    }
    public static void main(String[] args) {
       try{
        function();
       }catch(Throwable t){
            System.out.println(t.getMessage());
        }
    }
}
/* throw new runtime Exception("Error")
throw new RuntimeException("Message")
throw new Throwable("Message")

Not Allowed: X
throw new String X
Throw new Integer X
 */
