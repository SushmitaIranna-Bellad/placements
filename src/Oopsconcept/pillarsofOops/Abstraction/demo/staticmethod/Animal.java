package Oopsconcept.pillarsofOops.Abstraction.demo.staticmethod;

abstract class Animal {
    static void info(){
        System.out.println("Animal are living Beings");
    }
    abstract void sound();
    }
    class Dog extends Animal{
    void sound(){
        System.out.println("barking");
    }
}
class Employee7{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        Animal.info();
    }
}
