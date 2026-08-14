class Node {
    int data;       // stores the data
    Node next;      // reference to the next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;      // head points to the first node

    LinkedList() {
        this.head = null;
    }

    void insert(int data) {
        Node newNode = new Node(data); // creating a new node

        newNode.next = head;           // new node points to old head

        head = newNode;                // head now points to new node
    }
    #ye hum day3 mai padhe the and and ye method se hum new node add kar rahe in the middle of linkedlist  
    void insert_middle(int data, int position){
        Node newNode = new Node(data);

         node temp = head;

         for (i=0;i < position-1 ;i++){
            temp = temp.next;
         }
         newNode.next= temp;
         temp.next = newNode;
    }
}

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert_middle(5, 1); 
    }
}