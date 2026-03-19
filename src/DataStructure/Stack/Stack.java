package DataStructure.Stack;
//implementation of stack using linkedlist
class Stack {
    int[] arr;
    int top;
    int size;
    //constructor
    Stack(int size){
        this.size=size;
        arr=new int [size];
        top=-1; //if it is pointing -1 then stack is empty
}
//push operation
void push(int val){
        if(top==size-1){
            System.out.println("Stack OverFlown!");
            return;
        }
        top++;
        arr[top]=val;
}
//pop operation
void pop(){
        if(top==-1){
            System.out.println("Stack Underflown!");
            return;
        }
        arr[top]=0;//optional
        top--;
}
//top element
int Top(){
        if(top==-1){
            System.out.println("Stack Underflown!");
            return -1;
        }
        return arr[top];//it will write the top element
}
//check empty
boolean isEmpty(){
        return top==-1;
}
}
class Driver{
    static void main(String[] args) {
        Stack s=new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.Top());
        s.pop();
        System.out.println(s.Top());
        s.pop();
        System.out.println(s.Top());
        s.pop();
        System.out.println(s.Top());
        s.pop();
    }
}
