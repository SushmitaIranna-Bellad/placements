package Oopsconcept.CopyConstructordemo;

public class student {
    String name;
    int usn;

    student(String name, int usn) {
        this.name = name;
        this.usn = usn;
    }

    student(student obj) {
        this.name = obj.name;
        this.usn = obj.usn;
    }
    void display(){
        System.out.println("name "+name);
        System.out.println("usn "+usn);
    }
}
class Driver2{
    public static void main(String[] args) {
        student s1=new student("sush",123);
        student s2=new student(s1);
        s1.display();
        s2.display();
    }
}



