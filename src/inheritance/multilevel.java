package inheritance;

public class multilevel {
    void eat(){
        System.out.println("eating....");
    }
}
class Lionn extends Animal{
    void roar(){
        System.out.println("Roaring....");
    }
}
class BabyLion extends Lionn{
    void cry(){
        System.out.println("crying...");
    }
}
class Driver3{
    public static void main(String[] args){
        Animal a=new Animal();
        a.eat();
    Lionn l=new Lionn();
    l.roar();
    BabyLion bl=new BabyLion();
    bl.cry();
    }
}

