package Generics;


import java.util.ArrayList;

public class GenericsDemo1 {
    static void main(String[] args) {  //this ArrayList is Generic in java
        ArrayList<Integer> list=new ArrayList<>();//if we not use the diamond braces we will get unchecked exception
       // list.add("Hello");
        list.add(10);
       // list.add(1.5);//when we add the diamond operator in the Arraylist then we will get Compile Time Error
        int x=(int) list.get(0);
        System.out.println(x);
    }
}
