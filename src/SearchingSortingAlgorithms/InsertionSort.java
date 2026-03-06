package SearchingSortingAlgorithms;

public class InsertionSort {
    static void InsertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    static void main(String[] args) {
        int arr[]={4,7,2,5,1,3,6};
        InsertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
