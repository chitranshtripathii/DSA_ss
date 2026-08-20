class Node{
    int data; // data declare for node 
    Node next; // nex tnode ke pointer ko point karnane keliye declre 
    Node prev; // ye doubly linked list mai extra rahega and ye humare prevoious noide ko point karega 
}


class doublyLinkedList {
    Node head;
    Node tail;      // head points to the first node

    doublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    


void insertion_at_begining(int data) {
    Node newNode = new Node();
    if(this.head==null && this.tail==null){
        this.head=newNode;
        this.tail=newNode;
        return;
        
    }
    newNode.next=this.head;
    this.head.prev= newNode;
    this.head=newNode;
    this.tail=newNode;
}
void insertion_at_end(int data){
    Node newNode = new Node();

    if(this.head==null && this.tail==null){
           this.tail=newNode;
            return;
    }
    newNode.prev=this.tail; // new node jo add hoga uske prevoius mai existing node klla address aayega using tail 
    this.tail.next=newNode; // existing node ka next point karega new node ko
    this.tail=newNode; // tail points to new node  


}

void insertion_at_mid(int data,int Position){
    Node newNode = new Node();
    if(this.head==null && this.tail==null){
        this.head=newNode;
        this.tail=newNode;
        return;

    }

        Node temp =this.head; // in this we are taking temp variable and isko hum node ki value assign kar rahe 
        
        
        for(int i= 1;i<Position-1;i++){
            temp=temp.next;
        }

        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next.prev=newNode;
        temp.next=newNode;
}

}