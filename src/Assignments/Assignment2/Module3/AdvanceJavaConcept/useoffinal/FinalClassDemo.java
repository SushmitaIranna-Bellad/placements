package Assignments.Assignment2.Module3.AdvanceJavaConcept.useoffinal;
//final class can not be inherited
final class FinalClassDemo {

    //final variable: value can not be changed if once assigned
    final int number=100;

    //final method: cannot be overridden
    final void display(){
        System.out.println("Final variable value "+number);
    }
}
//this will give error bcz FinalClassDemo is final://class child extends FinalClassDemo

//seperate example to show final method behaviour
class parent{
    //final method :child class canont override this method
    final void showMessage(){
        System.out.println("This is final method in parent class ");
    }
}
class child extends parent{
    //this will give error message because void showMessage() is final
    /* void showMessage(){
        System.out.println("Trying to override final method ");
    }*/

    }
class Main1{
    static void main(String[] args) {

        //creating obj of final class
        FinalClassDemo obj=new FinalClassDemo();

        //calling final method
        obj.display();

        //demonstrating final variable
        //obj.number=200; //Error:cannot assign value to final variable

        //demonstrating final method in inheritance
        child cobj=new child();
        cobj.showMessage();
    }
}