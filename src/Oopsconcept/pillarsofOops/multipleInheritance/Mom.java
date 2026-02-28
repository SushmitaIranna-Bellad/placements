package Oopsconcept.pillarsofOops.multipleInheritance;
interface Mom {
    default void cook(){
        System.out.println("Indian");
    }
}
interface Dad{
    default void cook(){
        System.out.println("chineese");
    }
}
class child implements Mom,Dad{
    public void cook(){
        //System.out.println("cook");
        Mom.super.cook();
    }
}
class manager{
    public static void main(String[] args) {
        child c=new child();
        c.cook();
    }
}