# ye hum class banaye hai ki humara node kaisa dikhege 
class Node {
    int data;       // stores the data
    Node next;      // reference to the next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
# ye hum LinkedList naam ki class bana rahe taki humko lonked list ka structure miljaye 
class LinkedList {
    Node head;      // head points to the first node
# ye hum linkedlist ka constructor bana rahe 
    LinkedList() {
        this.head = null;
    }
# yaha pe hum nodes ko at begining of linkedlist add kar rahe ye ek method hai
    void insert(int data) {
        Node newNode = new Node(data); // creating a new node

        newNode.next = head;           // new node points to old head

        head = newNode;                // head now points to new node
    }
}

public class main{
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
    }
}