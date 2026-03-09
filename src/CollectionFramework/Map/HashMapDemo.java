package CollectionFramework.Map;

import java.util.HashMap;

public class HashMapDemo {
    static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        //put()->inserts key-value pair
        map.put(1,"Ashank");
        map.put(2,"David");
        map.put(3,"Sapthagiri");

        //get()-->retreive the val
        System.out.println(map.get(0));

        //containskey
        System.out.println(map.containsKey(1));

        //remove
        map.remove(1);
        System.out.println(map);
    }
}
/*
*features
* Stores the element as key-value pair
* key must be unique
* Vaues can be duplicated
* Does not maintain the insertion order
* uses the hashing internally
* Here we use-put(),get(),remove()
 */