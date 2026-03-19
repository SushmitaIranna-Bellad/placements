package RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.List;

public class SubSetArray {
    static void ArraySubset(int arr[], int index, List<Integer> current){
        //Base case
        if(index==arr.length){
            System.out.println(current);
            return;
        }
        //Add the element
        current.add(arr[index]);
        ArraySubset(arr,index+1,current);
        //BackTracking
        current.remove(current.size()-1);
        //skip and explore
        ArraySubset(arr,index+1,current);
    }

    static void main(String[] args) {
        int arr[]={1,2,3};
        ArraySubset(arr,0,new ArrayList<>());
    }
}
