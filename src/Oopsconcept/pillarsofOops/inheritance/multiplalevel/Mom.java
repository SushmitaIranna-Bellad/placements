package Oopsconcept.pillarsofOops.inheritance.multiplalevel;

public class Mom {
    void cook(){
        System.out.println("cooking");
    }
}
class dad{
    void work(){
        System.out.println("working");
    }
}
class child extends dad{
    void study(){
        System.out.println("studying");
    }
}
class employye{
    public static void main(String[] args) {
        Mom m=new Mom();
        dad d=new dad();
        child c=new child();
    }
}