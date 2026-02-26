
package pillarsofOops.Abstraction.demo.constructor;
abstract class Animal {
    Animal(){
        System.out.println("Animal Constructor");
    }
    abstract void sound();
}
class dog extends Animal {
    dog() {
        System.out.println("cicking");
    }

    void sound() {
        System.out.println("barking");
    }
}
class Animal66{
    public static void main(String[] args) {
        dog d=new dog();
        d.sound();
    }
}
/*why does abstract class have constructor?
->Constructor are used for initialising common data
->when a child class object is created the parent class constructor runs first
->parent constructor is getting executed because of inheritance and not because of object creation(this is to be answered in the interview)
*/
