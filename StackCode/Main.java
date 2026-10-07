package StackCode;

public class Main {

    public static void main(String[] args){
        stack Stack = new stack();

        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        Stack.push(40);

        Stack.display();
        System.out.println("-------------------------");


        Stack.Pop();
        System.out.println("-------------------------");

        Stack.display();




    }
    
}
