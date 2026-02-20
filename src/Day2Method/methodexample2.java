package Day2Method;

public class methodexample2 {
    int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        methodexample2 obj=new methodexample2();
        int s=obj.add(10,20);
        System.out.println(s);
    }
}
