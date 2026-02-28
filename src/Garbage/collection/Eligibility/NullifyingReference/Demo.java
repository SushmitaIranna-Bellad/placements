package Garbage.collection.Eligibility.NullifyingReference;

public class Demo {
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj=null; //now this is eligible for grabage collection
        System.out.println(obj);
    }
}
