package CollectionFramework.List;

import java.util.LinkedList;

public class Linkedlist {
    static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        list.addFirst("start");
        list.addLast("Stop");
        System.out.println(list);//Accessing will be done throughout the

    }
}
/**
 * features
 * maintains insertion order
 * allows duplicates
 * uses node structure internally - no indexes
 * slower reading but faster insertion and deletions compares to
 */
