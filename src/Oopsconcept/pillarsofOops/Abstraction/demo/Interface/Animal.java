package Oopsconcept.pillarsofOops.Abstraction.demo.Interface;

public interface Animal {
    void sound();
    void run();
}
class Lion implements Animal{
    public void sound(){
        System.out.println("sounding");
    }
    public void run(){
        System.out.println("fast");
    }
}
class Tiger implements Animal{
    public void sound(){
        System.out.println("Sounding");
    }
    public void run(){
        System.out.println("fast");
    }
}
class chamber{
    public static void main(String[] args) {
        Lion l=new Lion();
        l.sound();
        l.run();
    }
}

