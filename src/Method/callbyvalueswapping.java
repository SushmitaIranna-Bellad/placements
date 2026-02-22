package Method;

class callbyvalueswapping {
    static void swap(int[] arr){
        int temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
    }
    public static void main(String[] args){
        int[] num={10,20};
        System.out.println("Before swapping:");
        System.out.println("a="+num[0]+",b="+num[1]);
    swap(num);
        System.out.println("After swapping:");
        System.out.println("a="+num[0]+",b="+num[1]);
    }
}
