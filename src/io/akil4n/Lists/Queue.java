package io.akil4n.Lists;

public class Queue {
    Node head;
    Node tail;
    class Node {
        Object data;
        Node next;

        Node(Object data){
            this.data = data;
        }
    }
    void enqueue(Object data){
        if(head == null){
            head = new Node(data);
            tail = head;
        } else {
            Node node = new Node(data);
            tail.next = node;
            tail = node;
        }
    }
    Object dequeue(){
        Object data = head.data;
        head = head.next;
        return data;
    }
    void show(){
        System.out.print("QUEUE : [");
        while(head.next!=null){
            System.out.print(dequeue()+", ");
        }
        System.out.print(head.data+"]");

    }
    public static void main(String[] args) {
        Queue stack = new Queue();
        stack.enqueue(1);
        stack.enqueue(2);
        stack.enqueue(3);
        stack.enqueue(4);
        Object val = stack.dequeue();
        System.out.println("DEQUEUE : "+ val);
        stack.show();
        System.out.println();
    }

}
