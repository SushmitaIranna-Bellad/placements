package Arrays.Basics;
//this is tocheck majority elements {2,2,1,2,3,2,2}
//this is Brute Force method
public class MajorityOccurenceBruteForce {
    static void main(String[] args) {
        int arr[]={2,2,1,2,3,2,2};
        int n=arr.length;
        int majority=-1;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                majority=arr[i];
                break;
            }
        }
        if(majority!=-1){
            System.out.println("majority elements is : " +majority);
        }else{
            System.out.println("no majority elements");
        }
    }
}
