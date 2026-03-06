package Arrays.Basics;

public class Partition {
    static void main(String[] args) {
        int arr[]={5,2,8,7,1,6};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]%2==0){
                left++;
            }
            else if(arr[right]%2!=0){
               right--;
            }
            else{
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                left++;
                right--;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
