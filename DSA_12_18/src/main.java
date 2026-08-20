<<<<<<< HEAD:DSA_12_18/src/main.java
//ye hum class banaye hai ki humara node kaisa dikhege
class Nodee {
=======

// ye hum class banaye hai ki humara node kaisa dikhege
// ye hum class banaye hai ki humara node kaisa dikhege 
class Node {
>>>>>>> 7372ada049376d90ecfbdbd3bfa003d732d533f5:DSA_12_18/linkListday1.java
    int data;       // stores the data
    Nodee next;      // reference to the next node

    Nodee(int data) {
        this.data = data;
        this.next = null;
    }
}
//ye hum LinkedList naam ki class bana rahe taki humko lonked list ka structure miljaye
<<<<<<< HEAD:DSA_12_18/src/main.java
class LinkedListt {
    Nodee head;      // head points to the first node
// ye hum linkedlist ka constructor bana rahe
    LinkedListt() {
=======
class LinkedList {
    Node head;      // head points to the first node
    //ye hum linkedlist ka constructor bana rahe 
// (added deletion of node at end, mid, beginging)
    LinkedList() {
>>>>>>> 7372ada049376d90ecfbdbd3bfa003d732d533f5:DSA_12_18/linkListday1.java
        this.head = null;
    }
//yaha pe hum nodes ko at begining of linkedlist add kar rahe ye ek method hai
    void insert(int data) {
        Nodee newNode = new Nodee(data); // creating a new node

        newNode.next = head;           // new node points to old head

        head = newNode;                // head now points to new node
    }
    // (added deletion of node at end, mid, beginging)

    void delete_atbegining()
    {
        if (this.head == null)
            {System.err.println("list is empty");
                return;
            }
    this.head= this.head.next;
    this.head.next = null;
    }
    void delete_at_mid(int position) 
    {
         Node temp = head;

         for (int i=0; i < position-1; i++){
            temp = temp.next;
         }
         temp.next = temp.next.next;
    }
    void delete_at_end() {
        if(head == null){
            System.out.println("list is empty");
            return;
        }
         Node temp = head;

         while (temp.next != null){
            temp = temp.next;
         }
         temp.next = null;
    }
    void display() {
    Node temp = head;

    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }

    System.out.println("null");
    }

}

public class linkListday1 {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.delete_atbegining();
        linkedList.delete_at_mid(2);

    }
}