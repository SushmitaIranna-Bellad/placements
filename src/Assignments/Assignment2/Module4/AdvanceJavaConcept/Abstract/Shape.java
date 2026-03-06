package Assignments.Assignment2.Module4.AdvanceJavaConcept.Abstract;
abstract class Shape {
    abstract void area();

    }//create class rectngle
    class rectangle extends Shape{
    double length;
    double width;
    //constructor
        rectangle(double length,double width){
            this.length=length;
            this.width=width;
        }//implementing abstract method
        void area(){
            double result=length*width;
            System.out.println("Area of rectangle  " +result);
        }
}//circle class
class circle extends Shape{
    double radius;
    //constructor
    circle(double radius) {
        this.radius=radius;
    }
    //implementing abstract method
    void area(){
        double result=3.14*radius*radius;
        System.out.println("Area of circle  "   +result);
    }
}
class Employee7{
    static void main(String[] args) {
        circle c=new circle(5);
        c.area();
        rectangle r=new rectangle(4,6);
        r.area();
    }
}