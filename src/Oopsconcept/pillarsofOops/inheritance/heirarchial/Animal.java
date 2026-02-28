package Oopsconcept.pillarsofOops.inheritance.heirarchial;

public class Animal {
    void eat(){
        System.out.println("eating");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("roaring");
    }
}
class Tiger extends Animal{
    void chirp(){
        System.out.println("chirping");
    }
}
class employee2{
    public static void main(String[] args) {
        Animal a=new Animal();
                a.eat();
                Lion l=new Lion();
                l.roar();
                l.eat();
                Tiger t=new Tiger();
                t.chirp();
                t.eat();
    }
}
