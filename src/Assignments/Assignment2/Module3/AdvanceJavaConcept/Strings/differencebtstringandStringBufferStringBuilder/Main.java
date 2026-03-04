package Assignments.Assignment2.Module3.AdvanceJavaConcept.Strings.differencebtstringandStringBufferStringBuilder;

public class Main {
    static void main(String[] args) {
        //String Immutable
        String str="Hello";
        str.concat("world");//this will not change the original string
        System.out.println("String "+str);
        str=str.concat(" world");
        System.out.println("String after concat : "  +str);

        //StringBuilder (mutable,Not ThreadSafe)
        StringBuilder sbr=new StringBuilder("Sushmita ");
        sbr.append("Belld");//this will change the original string
        System.out.println("String after append : " +sbr);

        //StringBuffer (Mutable,ThreadSafe)
        StringBuffer sbf=new StringBuffer("Nann pappa ");
        sbf.append("nann kansu");//This will change the orifginal string
        System.out.println("String after append : "+sbf);
    }
}
