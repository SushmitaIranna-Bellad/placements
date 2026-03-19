package DataStructure.LinkedList;

class Node{
    int Data;
    Node next;
Node(int data){
    this.Data=data;
    this.next=null;
}
}

public class SLL {
    Node head;
    SLL(){
        head=null;
    } //this is o perform insert function
    void insertAtHead(int val){
        Node n=new Node(val);
        n.next=head;
        head=n;
    }
void insertAtTail(int val){
    Node n=new Node(val);
    if(head==null){
        head=n;
        return;
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=n;
}
int getSize(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
}
//it insert the value at particular position
void insertAtPos(int val,int pos) {
    int size = getSize();
    Node n = new Node(val);
    if (pos < 0 || pos > size) {
        System.out.println("Invalid Position Given!");
    } else if (pos == 0) {
        n.next = head;
        head = n;
    } else {
        Node temp = head;
        while (--pos > 0) {
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
    }
}
//to perform delete function
void deleteAtHead(){
        if(head==null){
            System.out.println("Get Lost");
        }
        Node toDelete=head;
        head=head.next;
        toDelete=null;
}
//it delete particular value
void deleteByValue(int val){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.Data==val){
            head=head.next;
            return;
        }
        if(head.Data==val){
            deleteAtHead();
            return;
        }
        Node temp=head;
        while(temp.next!=null&&temp.next.Data!=val){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("value not found");
            return;
        }
        Node toDelete=temp;
        temp.next=temp;
        toDelete=null;
}
void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.Data +"->");
    temp=temp.next;
    }
}
}
class Driver{
    static void main(String[] args) {
        SLL sll=new SLL();
        sll.insertAtHead(20);
        sll.insertAtHead(60);
        sll.insertAtTail(30);
        sll.insertAtTail(50);
        sll.insertAtTail(80);
        sll.insertAtPos(40,2);
        sll.display();
        sll.deleteAtHead();
        sll.display();
        sll.deleteByValue(20);
        sll.display();
    }
}


