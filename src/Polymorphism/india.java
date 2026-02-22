package Polymorphism;

public class india {
    void capital(){
        System.out.println("New delhi");
    }
}
class USA{
    void capital(){
        System.out.println("vasco da gama");
    }
}
class Employeeee{
    public static void main(String[] args) {
        india i=new india();
        i.capital();
        USA U=new USA();
        U.capital();
    }
}
