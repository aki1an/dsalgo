package io.akil4n.Recursion;

import java.util.*;

public class Subsets {
    static void subsets(String source, String set, int index, ArrayList<String> results) {
        if (index >= source.length()) {
            results.add(set);
            return;
        }
        subsets(source, set + (source.charAt(index)), index + 1, results);
        subsets(source, set, index + 1, results);
    }

    public static void main(String... argv) {
        String word = "abcd";
        ArrayList<String> results = new ArrayList<>();
        subsets(word, "", 0, results);
        System.out.println(results);
    }
}