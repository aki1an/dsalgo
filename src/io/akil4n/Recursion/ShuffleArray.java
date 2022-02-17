package io.akil4n.Recursion;

import java.util.Stack;

public class ShuffleArray {
    /*
    todo:
    Given an array arr[] of n elements in the following format {a1, a2, a3, a4, .., an/2, b1, b2, b3, b4, ., bn/2}, the task is shuffle the array to {a1, b1, a2, b2, a3, b3, , an/2, bn/2} without using extra space.

    Example 1:

        Input: n = 4, arr[] = {1, 2, 9, 15}
        Output:  1 9 2 15
        Explanation: a1=1 , a2=2 , b1=9 , b2=15
        So the final array will be :
        a1, b1, a2, b2 = { 1, 9, 2, 15 }

    Example 2:
        Input: n = 6
        arr[] = {1, 2, 3, 4, 5, 6}
        Output: 1 4 2 5 3 6
*/
    static void shuffle(long[] arr, int left, int right, int index, Stack<Long> stack){
        if(right == arr.length/2) return;
        long last = arr[right];
        long lastBef = arr[left];
        shuffle(arr, left-1, right-1, index-1, stack);
        stack.add(last);
        stack.add(lastBef);
    }
    public static void main(String[] args) {
        long[] arr = {1,2,3,4,5,6,7,8};
        Stack stack = new Stack();
        shuffle(arr, arr.length/2, arr.length-1, arr.length-1, stack);
        System.out.println(stack);
        for (long l : arr) System.out.println(l);
    }
}
