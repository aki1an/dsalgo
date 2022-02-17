package io.akil4n.Recursion;


import java.util.Stack;

public class ArraysMinMaxSort {

    public static int[] min(int[] arr, int[] minmax, int index) {
        if (index < 0) return minmax;
        minmax[0] = Math.min(minmax[0], arr[index]);
        minmax[1] = Math.max(minmax[1], arr[index]);
        return min(arr, minmax, index - 1);
    }

    public static int maxIndex(int[] arr, int maxIndex, int index) {
        if (index < 0) return maxIndex;
        return maxIndex(arr, arr[maxIndex] < arr[index] ? index : maxIndex, index - 1);
    }

    public static void sort(int[] arr, int index) {
        if (index < 0) return;
        int temp = maxIndex(arr, 0, index);
        int arc = arr[index];
        arr[index] = arr[temp];
        arr[temp] = arc;
        sort(arr, index - 1);
    }

    public static void insertAtBottom(Stack<Integer> stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, data);
        stack.push(top);
    }
    public static void rev(Stack<Integer> stack){
        if(stack.isEmpty()) return;
        int data = stack.pop();
        rev(stack);
        System.out.println(stack);
        insertAtBottom(stack,data);
    }

    public static void main(String[] args) {
        int[] arr = {4, 323, 52, 32, 6, 23, 621, 12, 32, 1, 23, 4};
        int[] res = {arr[0], arr[0]};
        res = min(arr, res, arr.length - 1);
        sort(arr, arr.length - 1);
        Stack<Integer> stack = new Stack<>();
        for (int j : arr) {
            System.out.println(j);
            stack.push(j);
        }
        System.out.println(stack);
        rev(stack);
        System.out.println(stack);
        System.out.printf("Minimum Element : %s \nMaximum Element : %s%n", res[0], res[1]);
    }
}
