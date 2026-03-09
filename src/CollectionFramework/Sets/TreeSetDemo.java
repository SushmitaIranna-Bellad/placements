package CollectionFramework.Sets;

import java.util.TreeSet;

public class TreeSetDemo {
    static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(10);
        System.out.println(set);
    }
}
/* Features
* almost same has the HashSet it follows the sorted order
* No Duplicates
* Automatically sort the data
* uses RED and BLACK tree in backend or internally
* SlowerThan Hash set
* used when we want the data to be sorted
 */