package CollectionFramework.Sets;

import java.util.HashSet;

public class HashSetDemo {
    static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(50);//it does not maintain order
        System.out.println(set.contains(20));
        set.remove(30);
        System.out.println(set.size());

        System.out.println(set);
    }
}
/*No Duplicates are allowed
*NoOrder of insertion is maintained
* uses Hashing internally
* Very Fast add,remove and Search Operations
* No indexes
 */