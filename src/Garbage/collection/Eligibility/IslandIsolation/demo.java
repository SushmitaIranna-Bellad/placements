package Garbage.collection.Eligibility.IslandIsolation;

public class demo {
    demo ref;
}
class ha{
    public static void main(String[] args) {
        demo obj1=new demo();
        demo obj2=new demo();
        obj1.ref=obj2;
        obj2.ref=obj1;
        obj1=null;
        obj2=null;
    }
}
