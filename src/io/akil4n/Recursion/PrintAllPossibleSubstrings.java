package io.akil4n.Recursion;

import java.util.ArrayList;
import java.util.List;

/**
TODO:
Given a string str your task is to complete the function spaceString which takes only one argument the string str and  finds all possible strings that can be made by placing spaces (zero or one) in between them.

For eg .  for the string abc all valid strings will be
            1.  abc
                ab c
                a bc
                a b c
            2.  abcd
                abc d
                ab cd
                ab c d
                a bcd
                a bc d
                a b cd
                a b c d

Example 1:

Input:
str = abc
Output: abc$ab c$a bc$a b c$

 <h1>RECURSIVE TREE<h1/>

                                 bcd
                             /        \
                          bcd           bc_d
                        /   \          /    \
                     bcd    b_cd   bc_d   b_c_d

*/
public class PrintAllPossibleSubstrings {
    static List<String> spaceString(String source, List<String> results, int index) {
        if (index == 0) {
            results.add(source.trim());
            return results;
        }
        spaceString(source, results, index - 1);
        StringBuilder spaceString = new StringBuilder(source).insert(index, " ");
        spaceString(new String(spaceString), results, index - 1);
        return results;
    }

    public static void main(String[] args) {
        List<String> res = new ArrayList<>();
        String source = "abc";
        spaceString(source, res, source.length() - 1);
        for (String e : res) {
            System.out.print(e+"$");
        }
    }
}
