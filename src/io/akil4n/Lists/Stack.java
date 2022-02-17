package io.akil4n.Lists;

public class Stack {
    Node head;
    class Node {
        Object data;
        Node next;

        Node(Object data){
            this.data = data;
        }
    }
    void push(Object data){
        Node current = new Node(data);
        current.next = head;
        head = current;
    }
    Object pop(){
        Object data = head.data;
        head = head.next;
        return data;
    }
    void show(){
        System.out.print("STACK : [");
        while(head.next!=null){
            System.out.print(pop()+", ");
        }
        System.out.print(head.data+"]");
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        Object val = stack.pop();
        System.out.println("POP : "+ val);
        stack.show();
        System.out.println();
    }

}
