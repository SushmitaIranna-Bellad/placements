package Oopsconcept.Oopsclasswithattributes;

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
    class Driver{
        public static void main(String[] args) {
            Car c1=new Car("audi",1995,"red");
                    c1.printDetails();
        }
    }
