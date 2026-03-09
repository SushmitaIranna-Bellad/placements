package CollectionFramework.List;

import java.util.ArrayList;

public class ArrayListDemo {
    static void main(String[] args) {// ArrayList it is generic class it deals with the so we write that in diamond braces
        ArrayList<Integer> list=new ArrayList<>();//list will inherit the collection
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        System.out.println("Array List: "+list);
        System.out.println(list.get(1));//get the element at he index 1
        System.out.println(list.size());//get the size of the list
        System.out.println(list.contains(100));//checking if the list contain the particular element or not
        System.out.println(list.remove(2));//to remove particular element
        System.out.println("Array List: "+list);
        for(int i:list){
            System.out.println(i+" ");
        }
    }
}
/* Features
*Maintains order of insertion
* *allows duplicates
* Dynamic size
* index based access
* Fast for reading
 */