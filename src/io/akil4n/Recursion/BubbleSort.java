package io.akil4n.Recursion;

public class BubbleSort {
    static int[] bubbleSort(int[] arr, int index) {
        if (index == arr.length) return arr;
        for (int i = 0; i < arr.length; i++) {
            if (arr[index] < arr[i]) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        return bubbleSort(arr, index + 1);

    }

    public static void main(String[] args) {
        int[] nums = {9, 234, 32, 35, 1, 35, 63, 74, 23, 12, 3, 0};
        bubbleSort(nums, 0);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
