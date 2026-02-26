package pillarsofOops.Abstraction.demo.Interface.interfaces100NotAbstract;

public interface Demo {
    void show();//Abstract Method
    default void display(){ //100% abstraction is not available  after the java 8
        System.out.println("Default Method!");
    }
    static void message(){
        System.out.println("Static method!");
    }
}
class Driver{
    public static void main(String[] args) {
        Demo.message();
    }
}
