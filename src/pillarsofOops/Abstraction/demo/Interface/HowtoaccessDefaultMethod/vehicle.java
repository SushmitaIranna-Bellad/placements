package pillarsofOops.Abstraction.demo.Interface.HowtoaccessDefaultMethod;

public interface vehicle {
    default void stop(){
        System.out.println("stopped");
    }
}
class car implements vehicle{
    public void stop(){
        System.out.println("stopped");
    }
}
class bike implements vehicle{
    public void stop(){
        System.out.println("bike stopped");
    }
}
class fisher{
    public static void main(String[] args) {
        car c1=new car();
        c1.stop();
        vehicle v=new car();
        v.stop();
        bike b=new bike();
        b.stop();
    }
}
