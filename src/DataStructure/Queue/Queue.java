package DataStructure.Queue;

public class Queue {
    int[] arr;
    int front;
    int back;
    int size;
    Queue(int size){
        this.size=size;
        arr=new int[size];
        front=-1;
        back=-1;
    }
    void push(int val){
        if(back==size-1){
            System.out.println("Queue Overflown");
            return;
        }
        back++;
        arr[back]=val;
        if(front==-1){
            front++;
        }
      }
      void pop(){
        if(front==-1 || front>back){
            System.out.println("Queue underflown");
            return;
        }
        arr[front]=0;
        front++;
    }
    int peek(){
        if(front==-1 || front>back){
            System.out.println("Queue Underflown");
            return -1;
        }
        return arr[front];
    }
    boolean isEmpty(){
        return(front==-1 || front>back);
    }
}
class Driver8{
    static void main(String[] args) {
        Queue q=new Queue(5);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        System.out.print(q.peek());
        q.pop();
        System.out.print(q.peek());
        q.pop();
        System.out.print(q.peek());
        q.pop();
        System.out.print(q.peek());
        q.pop();
        System.out.print(q.peek());
        q.pop();
        System.out.print(q.peek());
        q.pop();
    }
}
