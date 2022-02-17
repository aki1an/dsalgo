package io.akil4n.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseStack {
    //TIME : O(N)  SPACE : O(N)
    static void reverseStack(Stack<Integer> stack, int n, List<Integer> list){
        if(stack.isEmpty()){
            return;
        }
        list.add(stack.pop());
        reverseStack(stack, n-1, list);
        stack.push(list.get(n-1));
    }
    //TIME : O(N^2) SPACE : O(1)
    static void reverseStack(Stack<Integer> stack){
        if(stack.size() == 1) return;
        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, top);
    }
    //TIME : O(N) SPACE O(1)
    static void insertAtBottom(Stack<Integer> stack, int data){
        if(stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, data);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<10;i++) stack.push(i);
        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
        reverseStack(stack, stack.size(), new ArrayList<>());
        System.out.println(stack);

    }
}
