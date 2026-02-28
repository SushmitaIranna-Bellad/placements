package Strings.Buffer.Builder;

public class BufferExample {
    public void Append(){
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println("old string :" +sb);
        sb.append(" World");
        System.out.println("new string :"+sb);
    }
    public void Insert(){
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println("old string :"+sb);
        sb.insert(1,"EEE");
        System.out.println("new string :"+sb);
    }
    public void Reverse(){
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println("old string :"+sb);
        sb.reverse();
        System.out.println("new string :"+sb);
    }
}
class Driver8{
    public static void main(String[] args) {
        BufferExample sb=new BufferExample();
        sb.Append();
        sb.Insert();
        sb.Reverse();

    }
        }
