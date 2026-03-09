package WrapperClass;
//primitive ------->ObjectConversion = Boxing
public class WrapperDemo1 {
    static void main(String[] args) {
        int x=10;
        Integer obj=new Integer(x);//Manual Boxing
        System.out.println("primitive value "+x);
        System.out.println("Object Value "+obj);
    }
}
