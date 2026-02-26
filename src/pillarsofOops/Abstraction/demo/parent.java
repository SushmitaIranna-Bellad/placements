package pillarsofOops.Abstraction.demo;

abstract class parent {
    abstract void dad();
    void mom(){
        System.out.println("cook");
    }
}
 class child extends parent{
    void dad(){
        System.out.println("study");
    }
}
class employee{
    public static void main(String[] args) {
        child c=new child();
        c.dad();
        c.mom();
    }
}