package Assignments.Assignment2.Module4.AdvanceJavaConcept.Interface;
//interface
public interface payment {
    void pay(double amount);

}//CreditcardPayment class
class CreditCardPayment implements payment{
    //@override
    public void pay(double amount){
        System.out.println("payment of Rs " +amount +" made using credit card");
    }
}//UPIPayment class
class UPIPayment implements payment{
    //@override
    public void pay(double amount){
        System.out.println("payment of Rs " +amount+ " made using UPI paymnet");
    }
}
class main{
    static void main(String[] args) {
        CreditCardPayment c=new CreditCardPayment();
        c.pay(20000);
        UPIPayment U=new UPIPayment();
        U.pay(30000);
    }
}
