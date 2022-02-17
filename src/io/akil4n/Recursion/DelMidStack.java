package io.akil4n.Recursion;

import java.util.Stack;

public class DelMidStack {

    //recursive approach
    static void removeMiddle(Stack<Integer> stack, int position, int size) {
        if (position == size / 2) {
            System.out.println("middle element :  " + stack.pop());
            return;
        }
        int data = stack.pop();
        removeMiddle(stack, position + 1, size);
        stack.push(data);
    }

    //iterative approach
    static void removeMiddle(Stack<Integer> stack) {
        int pos = 0;
        int size = stack.size();
        Stack<Integer> tempStk = new Stack<>();
        while (pos != size / 2) {
            pos++;
            tempStk.push(stack.pop());
        }
        System.out.println("middle element :  " + stack.pop());
        while (!tempStk.isEmpty()) {
            stack.push(tempStk.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack);
        for (int i = 0; i < 9; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        removeMiddle(stack, 0, stack.size());
        System.out.println(stack);
        removeMiddle(stack);
        System.out.println(stack);
    }
}
