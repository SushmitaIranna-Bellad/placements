package Oopsconcept.pillarsofOops.encapsulation;

public class Student {
    private String name;
    private int usn;
    Student(String name,int usn){
        this.name=name;
        this.usn=usn;
    }
    String getName(){
        return this.name;
    }
    void setName(String name)
    {
        this.name=name;
    }
    int getUsn(){
        return this.usn;
    }
    void setUsn(int usn)
    {
        this.usn=usn;
    }
    void printDetails()
    {
        System.out.println("student name is:"+this.name);
        System.out.println("usn is:"+this.usn);
    }
}
class employee44{
    public static void main(String[] args) {
        Student s1=new Student("Sushma",123);
        s1.printDetails();
        System.out.println("name is:"+s1.getName());
        s1.setName("sinch");
        s1.printDetails();
    }
}
