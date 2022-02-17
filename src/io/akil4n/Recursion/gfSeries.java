package io.akil4n.Recursion;

import static java.lang.System.out;

public class gfSeries {

    static long gfSerie(int N, long[] lookup) {
        if (lookup[N] != 0) {
            return lookup[N];
        }
        long Ni = gfSerie(N - 2, lookup);
        lookup[N] = Ni * Ni - gfSerie(N - 1, lookup);
        return lookup[N];
    }

    static void gfSeries(int N) {
        long val1 = 0;
        long val2 = 1;
        if (N == 1)
            out.println(val1);
        if (N == 2)
            out.println(val1 + " " + val2);
        out.print(val1 + " " + val2 + " ");
        for (int i = 3; i <= N; i++) {
            long temp = val1 * val1 - val2;
            out.print(temp + " ");
            val1 = val2;
            val2 = temp;
        }
    }

    public static void main(String[] args) {
        int n = 8;
        long[] arr = new long[n + 1];
        arr[1] = 0;
        arr[2] = 1;
        arr[3] = -1;
        gfSerie(n, arr);
        for (int i = 1; i <= n; i++) {
            out.print(arr[i] + " ");
        }
        out.println();
        gfSeries(n);
    }
}
