//ye hum class banaye hai ki humara node kaisa dikhege
class Nodee {
    int data;       // stores the data
    Nodee next;      // reference to the next node

    Nodee(int data) {
        this.data = data;
        this.next = null;
    }
}
//ye hum LinkedList naam ki class bana rahe taki humko lonked list ka structure miljaye
class LinkedListt {
    Nodee head;      // head points to the first node
// ye hum linkedlist ka constructor bana rahe
    LinkedListt() {
        this.head = null;
    }
//yaha pe hum nodes ko at begining of linkedlist add kar rahe ye ek method hai
    void insert(int data) {
        Nodee newNode = new Nodee(data); // creating a new node

        newNode.next = head;           // new node points to old head

        head = newNode;                // head now points to new node
    }
}

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
    }
}