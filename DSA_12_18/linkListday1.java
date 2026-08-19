<<<<<<< HEAD
// ye hum class banaye hai ki humara node kaisa dikhege
=======
// ye hum class banaye hai ki humara node kaisa dikhege 
>>>>>>> 05fec27 (added deletion of node at end, mid, beginging)
class Node {
    int data;       // stores the data
    Node next;      // reference to the next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
<<<<<<< HEAD
//ye hum LinkedList naam ki class bana rahe taki humko lonked list ka structure miljaye
class LinkedList {
    Node head;      // head points to the first node
//ye hum linkedlist ka constructor bana rahe
=======
// ye hum LinkedList naam ki class bana rahe taki humko lonked list ka structure miljaye 
class LinkedList {
    Node head;      // head points to the first node
// ye hum linkedlist ka constructor bana rahe 
>>>>>>> 05fec27 (added deletion of node at end, mid, beginging)
    LinkedList() {
        this.head = null;
    }
//yaha pe hum nodes ko at begining of linkedlist add kar rahe ye ek method hai
    void insert(int data) {
        Node newNode = new Node(data); // creating a new node

        newNode.next = head;           // new node points to old head

        head = newNode;                // head now points to new node
    }
    void delete_atbegining()
    {
        if (this.head=Null)
            {System.err.println("list is empty");
                return;
            }
    this.head= this.head.next;
    this.head.next = Null;
    }
    void delete_at_mid( int position) 
    {
        Node newNode = new Node(data);

         Node temp = head;

         for (i=0;i < position-1 ;i++){
            temp = temp.next;
         }
         temp.next =temp.next.next;
    }
    void delete_at_end() {
        if(head== Null){
            System.out.println("list is empty");
            return;
        }
         Node temp = head;

         for (i=0;i < temp.next.next!=null ;i++){
            temp = temp.next;
         }
         temp.next = Null;
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
        linkedList.delete_atbegining(2);
        linkedList.delete_at_mid(2);

    }
}