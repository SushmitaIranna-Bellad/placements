package Oopsconcept.pillarsofOops.Abstraction.demo;

abstract class Animal {
    abstract void sound();

    void run(){
        System.out.println("running");
    }
}
class lion extends Animal{
    void sound(){
        System.out.println("roar");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("meow");
    }
}
class Employee{
    public static void main(String[] args) {
        lion l=new lion();
        l.sound();
        l.run();
    }
}
