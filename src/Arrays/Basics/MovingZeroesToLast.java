package Arrays.Basics;

//given arr={0,1,0,3,12} or {4,0,5,0,0}
//this code is to move all zeroes to the end
public class MovingZeroesToLast {
    static void main(String[] args) {
        int arr[]={0,1,0,3,0,12};
        int count=0;   //index for non-zero elements
        //move all nonzero elements to the front
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }

        //fill remaining position with zeroes
        while(count<arr.length){
            arr[count]=0;
            count++;
        }

        //print the array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
