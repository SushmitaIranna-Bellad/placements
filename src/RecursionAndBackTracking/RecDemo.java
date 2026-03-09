package RecursionAndBackTracking;

public class RecDemo {
    static void function(){
        System.out.println("Hello");
        function();
    }
    static void main(String[] args) {
        function();
    }
}
