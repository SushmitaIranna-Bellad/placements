package Generics;
 class Test2<K,V>{
     K key;
     V value;
     Test2(K key,V value){
         this.key=key;
         this.value=value;
     }
     void display(){
         System.out.println(key+" "+value);
     }
 }
public class Demo2 {
    static void main(String[] args) {
        Test2<String,Integer> obj1=new Test2("sushma",234);
        obj1.display();
    }
}
