package io.akil4n.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationCaseChange {

    /**
     * INPUT  : ab
     * OUTPUT : ab, Ab, aB, AB
     * <p>
     * INPUT  : a
     * OUTPUT : a A
     */

    public static void casePermutations(String word, int index, List<String> results) {
        if (index < 0) {
            results.add(word);
            return;
        }
        char[] arr = word.toCharArray();
        arr[index] = Character.toUpperCase(arr[index]);
        casePermutations(String.valueOf(arr), index - 1, results);
        casePermutations(word, index - 1, results);
    }

    /**
     * INPUT  : a1b1
     * OUTPUT : A1B1, a1B1, A1b1, a1b1
     */

    public static void letterCase(String word, int index, List<String> results) {

        if (index < 0) {
            results.add(word);
            return;
        }
        if (!(word.charAt(index) >= '0' && word.charAt(index) <= '9')) {
            char[] arr = word.toCharArray();
            arr[index] = Character.toUpperCase(arr[index]);
            letterCase(String.valueOf(arr), index - 1, results);
        }
        letterCase(word, index - 1, results);

    }

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        String word = "ab";
        casePermutations(word, word.length() - 1, result);
        System.out.println(result);
        word = "a1b1";
        result = new ArrayList<>();
        letterCase(word, word.length() - 1, result);
        System.out.println(result);
    }
}
