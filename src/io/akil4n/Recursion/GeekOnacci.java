package io.akil4n.Recursion;

/*package whatever //do not write package name here */

import java.util.Scanner;

class GeekOnacci {
    public static int onacci(int first, int second, int third, int n) {
        if (n == 1) return first;
        if (n == 2) return second;
        if (n == 3) return third;
        if (n == 4) return first + second + third;
        int f = onacci(first, second, third, n - 1);
        int s = onacci(first, second, third, n - 2);
        int t = onacci(first, second, third, n - 3);

        return f + s + t;
    }

    public static int onacci(int n, int[] memo) {
        if (memo[n] != 0) return memo[n];
        int f = onacci(n - 1, memo);
        int s = onacci(n - 2, memo);
        int t = onacci(n - 3, memo);
        memo[n] = f + s + t;
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T-- > 0) {
            int first = s.nextInt();
            int second = s.nextInt();
            int third = s.nextInt();
            int n = s.nextInt();
            int arr[] = new int[n + 1];
            arr[1] = first;
            arr[2] = second;
            arr[3] = third;
            System.out.println(onacci(first, second, third, n));
            System.out.println(onacci(n, arr));
        }
    }
}