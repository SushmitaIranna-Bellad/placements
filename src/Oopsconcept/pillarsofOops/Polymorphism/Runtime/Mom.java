package Oopsconcept.pillarsofOops.Polymorphism.Runtime;

public class Mom {
        void cook(){
            System.out.println("cooking..");
        }
    }
    class son extends Mom{
        void eat(){
            System.out.println("eating..");
        }
    }
class employee6{
    public static void main(String[] args) {
        Mom m=new Mom();
        m.cook();
        son s=new son();
        s.eat();
    }
}
