package StackCode;

public class stack {
    Node Top;

    stack(){
        Top =null;
    }
    //insert kar rahe push 

    void push(int data){
        Node NewNode = new Node(data);
        NewNode.next=Top;
        Top=NewNode;
    





    }

    void display (){
        Node current = Top;

        while (current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }




    void Pop(){
        if(Top==null){
            System.out.println("Stack is empty");

        }


        Node value = Top;
        Top= Top.next;
        System.out.println(value.data);




    }
}
