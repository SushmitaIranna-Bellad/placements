package pillarsofOops.Abstraction.demo.Interface;

public interface vehicle {
    void start();
    default void stop(){
        System.out.println("stopped");
    }
}
class audi implements vehicle{
    public void start(){
        System.out.println("it is good");
    }
}
class BMW implements vehicle{
    public void start(){
        System.out.println("it is better");
    }
}
class RoleRoyee implements vehicle{
    public void start(){
        System.out.println("it is best");
    }
}
class employee7{
    public static void main(String[] args) {
        audi A=new audi();
        A.start();
        A.stop();
        BMW B=new BMW();
        B.start();
        B.stop();
        RoleRoyee R=new RoleRoyee();
        R.start();
        R.stop();
    }
}
