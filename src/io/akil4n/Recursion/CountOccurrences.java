package io.akil4n.Recursion;

public class CountOccurrences {
    static int countOccurrences(String word, Character target, int count, int index) {
        return index < 0
                ? count
                : countOccurrences(word, target, word.charAt(index) == target ? count + 1 : count, index - 1);
    }
    public static void main(String[] args) {
        String word = "akilan";
        System.out.println(countOccurrences(word, 'a', 0, word.length() - 1));
    }
}
