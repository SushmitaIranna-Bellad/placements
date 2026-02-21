package Constructor;

public class Students {
    private String name;
    private int usn;

    Students(String name, int usn) {
        this.name = name;
        this.usn = usn;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getUSN() {
        return this.usn;
    }

    void setUSN(int usn) {
        this.usn = usn;
    }

    void printDetails() {
        System.out.println("student name is "+ this.name);
        System.out.println("student usn is " + this.usn);
    }
}
    class Teacher{
       public static void main(String[] args) {
           Students s1=new Students("sush",123);
                   s1.printDetails();
                   s1.getName();
        }
    }

