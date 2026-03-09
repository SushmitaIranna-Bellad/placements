package Assignments.Assignment3.Module7.StableVSUnstable;


class Item {
    int value;
    char id;

    Item(int value, char id) {
        this.value = value;
        this.id = id;
    }
}

public class UnstableSortExample {

    public static void main(String[] args) {

        Item[] arr = {
                new Item(3,'A'),
                new Item(1,'B'),
                new Item(3,'C'),
                new Item(2,'D')
        };

        for(int i=0;i<arr.length-1;i++){

            int min = i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j].value < arr[min].value)
                    min = j;
            }

            Item temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println("After Unstable Sorting (Selection Sort):");

        for(Item item : arr){
            System.out.print(item.value + "" + item.id + " ");
        }
    }
}