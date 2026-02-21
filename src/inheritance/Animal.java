package inheritance;

public class Animal {
    void eat(){
        System.out.println("eating....");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("Roaring....");
    }
}
class donkey{
    public static void main(String[] args){
        Animal a=new Animal();
        a.eat();

    }
}
