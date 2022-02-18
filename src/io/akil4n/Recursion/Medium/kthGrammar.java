package io.akil4n.Recursion.Medium;

import java.util.Scanner;

public class kthGrammar {

    /**
     * https://leetcode.com/problems/k-th-symbol-in-grammar/
     *
     * <h3>Example 1:</h3>
     *
     * Input: n = 1, k = 1
     * Output: 0
     * Explanation: row 1: 0
     *
     *<h3>Example 2:</h3>
     *
     * Input: n = 2, k = 1
     * Output: 0
     * Explanation:
     * row 1: 0
     * row 2: 01
     *
     *      <h2>matrix</h2>
     *
     *      0                               <br>
     *      0 1                             <br>
     *      0 1 1 0                         <br>
     *      0 1 1 0 1 0 0 1                 <br>
     *      0 1 1 0 1 0 0 1 1 0 0 1 0 1 1 0 <br>
     * */
    static int findKthGrammar(int n, int k) {
        if (n == 1 && k == 1)
            return 0;
        if (k <= Math.pow(2, n - 2)) {
            return findKthGrammar(n - 1, k);
        }
        return findKthGrammar(n - 1, k - (int) Math.pow(2, n - 2)) == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int result = findKthGrammar(s.nextInt(), s.nextInt());
        System.out.println(result);
    }
}
