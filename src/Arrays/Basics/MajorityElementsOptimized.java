package Arrays.Basics;
//his is what the voting algorithm used to check maximum votes
//Bouyer Moore Algorithm
public class MajorityElementsOptimized {
    static void main(String[] args) {
        int arr[] = {2, 2, 1, 2, 3, 2, 2};
        int candidate = arr.length;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
            if(count==0){
                candidate=arr[i];
                count=1;
            }
        }
        System.out.println("majority of candidates : "+candidate);
    }
}
