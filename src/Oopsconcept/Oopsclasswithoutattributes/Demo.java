package Oopsconcept.Oopsclasswithoutattributes;

public class Demo {
    void Demo(){

        System.out.println("Im a constructor");
    }
}
class multiple{
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.Demo();
    }
}
