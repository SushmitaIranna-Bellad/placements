package Arrays.Basics;
//Reversing of an Array using two pointer approach
public class ReverseArray {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int start=0;
        int end=arr.length-1;
        //while keep on working until the start index get smaller
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];//{5,2,3,4,_}
            arr[end]=temp;//{5,2,3,4,1}
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
