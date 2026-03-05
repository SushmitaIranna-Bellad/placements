package Arrays.Basics;
//firstly the array filled with zero then we need to replace it index 1to3 with 5
public class ReplacingZeros {
    static void main(String[] args) {
        int arr[]=new int[1000];
        for(int i=400;i<=500;i++){
            arr[i]=5;
            arr[i]=2;
        }
        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
