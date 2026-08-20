class Node2 {
    int data;       // stores the data
    Node2 next;      // reference to the next node

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList2 {
    Node2 head;      // head points to the first node

    LinkedList2() {
        this.head = null;
    }

    void insert(int data) {
        Node2 newNode = new Node2(data); // creating a new node

        newNode.next = head;           // new node points to old head

        head = newNode;                // head now points to new node
    }
<<<<<<< HEAD:DSA_12_18/src/linkListday2.java
    //ye hum day3 mai padhe the and and ye method se hum new node add kar rahe in the middle of linkedlist
    void insert_at_middle(int data, int position){
        Node newNode = new Node(data);

         Node temp = head;

         for (int i=0;i < position-1 ;i++){
=======
 
//ye hum day3 mai padhe the and and ye method se hum new node add kar rahe in the middle of linkedlist
    //ye hum day3 mai padhe the and and ye method se hum new node add kar rahe in the middle of linkedlist  
// 05fec27 (added deletion of node at end, mid, beginging)
    void insert_middle(int data, int position){
        Node2  newNode = new Node2(data);

         Node2 temp = head;

         for ( int i=0;i < position-1 ;i++){
>>>>>>> 7372ada049376d90ecfbdbd3bfa003d732d533f5:DSA_12_18/linkListday2.java
            temp = temp.next;
         }
         newNode.next= temp;
         temp.next = newNode;
    }
}

public class linkListday2 {
    public static void main(String[] args) {

        LinkedList2 linkedList = new LinkedList2();

        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert_at_middle(5, 1); 
    }
}