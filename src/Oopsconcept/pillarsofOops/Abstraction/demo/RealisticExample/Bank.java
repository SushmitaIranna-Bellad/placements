package Oopsconcept.pillarsofOops.Abstraction.demo.RealisticExample;

abstract class Bank {
    String branch;
    Bank(String branch){ //parent constructor
        this.branch=branch;
        System.out.println("Branch is" +branch);
    }
    abstract void calculateInterest();

}
class HDFC extends Bank{
    HDFC(String branch){
        super(branch); //super keyword calls the parent constructor
    }
    void calculateInterest(){
        System.out.println("Interest is 10%");
    }
}
class Driver8{
    public static void main(String[] args) {
        HDFC obj=new HDFC("Vijayanagar");
        obj.calculateInterest();
    }
}