package pillarsofOops.Polymorphism.Compiletime;

public class Addition {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
class Employee5{
    public static void main(String[] args) {
        Addition obj1=new Addition();
        obj1.add(1,2);
        obj1.add(3,4);
    }
}
