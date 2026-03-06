package Assignments.Assignment2.Module4.AdvanceJavaConcept.StaticVariableAndStaticMethod;

public class StaticDemo {

    //static variable:shared by all objects of the class
    static int count=0;

    //instance variable:separate copy for each object
    int rollNo;

    //constructor
    StaticDemo(int r){
        rollNo=r;
        count++;//Incremrnt statics
    }

    //Static method:can access only static members directly
    static void showCount(){
        System.out.println("Total objects created: "+count);
        //cannot access Non-static variable directly here
        //System.out,println(rollNo); //Error
    }
    //Non-static method
    void display(){
        System.out.println("Roll No: "+rollNo);
    }
}
class Main2{
    static void main(String[] args) {
        //creating object
        StaticDemo s1=new StaticDemo(101);
        s1.display();
        StaticDemo s2=new StaticDemo(101);
        s2.display();
        StaticDemo s3=new StaticDemo(101);
        s3.display();

        //calling static method using class name
        StaticDemo.showCount();


    }
}