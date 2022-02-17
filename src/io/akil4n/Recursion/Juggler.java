package io.akil4n.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Juggler {
    static List<Integer> jugglerSequence(int N) {
        return jugglerSequence(N, new ArrayList<>());
    }

    static List<Integer> jugglerSequence(int N, List<Integer> list) {
        if (N <= 1) {
            list.add(N);
            return list;
        }
        list.add(N);
        N = N % 2 == 0 ? (int) Math.pow(N, 0.5) : (int) Math.pow(N, 1.5);
        jugglerSequence(N, list);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(jugglerSequence(6));
        System.out.println(jugglerSequence(9));
        System.out.println(jugglerSequence(9));
    }
}
