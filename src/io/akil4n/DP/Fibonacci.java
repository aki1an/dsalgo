package io.akil4n.DP;

import java.util.Arrays;

public class Fibonacci {
    //recursive
    static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    //recursive + memoization
    static int fibonacci(int n, int[] memo) {
        if (memo[n] != -1) return memo[n];
        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }
    //iterative
    static int fibonacci(Integer n) {
        int first = 0;
        int second = 1;
        int third = 1;
        for (int i = 2; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }

    public static void main(String[] args) {
        int n = 40;
        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);
        arr[0] = 0;
        arr[1] = 1;
        System.out.println(fibonacci(n));
        System.out.println(fibonacci(n, arr));
        System.out.println(fibonacci(new Integer(n)));
    }
}