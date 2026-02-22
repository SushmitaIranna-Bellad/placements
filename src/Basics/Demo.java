package Basics;

class Demo {
    static void demoFunction(){
        System.out.println("Basics.Hello Basics.Demo");
    }
    static void Hii(){
        System.out.println("Hii");
    }
}
class employee{
    public static void main(String[] args) {
        Demo.demoFunction();
        Basics.Demo.Hii();
    }
}
