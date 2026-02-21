package Day3Oopsbasics;

public class Car {
    String BrandName;
    int ManuDate;
    String Color;
    public Car(String BrandName, int MDate, String C){
        this.BrandName=BrandName;
        ManuDate=MDate;
        Color=C;
    }
    void printDetails(){
        System.out.printf("Car BrandName is %s",this.BrandName);
        System.out.println("Car Manufacturing date is"+ManuDate);
        System.out.printf("Car Color %s" ,Color);
    }
    }
    class Object{
    public static void main(){
        Car c1=new Car("Audi",2000,"Red");
        Car c2=new Car("Reva",1995,"Blue");
        c1.printDetails();
        c2.printDetails();
    }
}
