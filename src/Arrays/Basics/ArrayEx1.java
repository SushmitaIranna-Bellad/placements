package Arrays.Basics;

public class ArrayEx1 {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5}; //if we try to print arr then it print some garbage because here the arr is pointer
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
