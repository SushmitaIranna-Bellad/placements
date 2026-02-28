package Strings.Buffer.Builder;

public class BuilderExample {
    public void Append(){
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println("old string:"+sb);
        sb.append("world");
        System.out.println("new string:"+sb);
    }
    public void insert(){
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println("old string:"+sb);
        sb.insert(1,"EEE");
        System.out.println("new string :"+sb);
    }
    public void reverse(){
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println("old string:"+sb);
        sb.reverse();
        System.out.println("new string:"+sb);
    }
}
class Employree8{
    public static void main(String[] args) {
        BuilderExample obj=new BuilderExample();
        obj.Append();
        obj.insert();
        obj.reverse();
    }
}
