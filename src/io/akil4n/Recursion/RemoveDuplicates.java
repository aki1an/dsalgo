package io.akil4n.Recursion;

import java.util.HashMap;

public class RemoveDuplicates {
    static StringBuilder removeDuplicates(char[] arr, HashMap<Character, String> hash, int index, StringBuilder computed) {
        if (index == arr.length) {
            return computed;
        }
        else{
            if (!hash.containsKey(arr[index]))
                computed.append(arr[index]);
            hash.put(arr[index], "");
            return removeDuplicates(arr, hash, index+1, computed);
        }
    }

    public static void main(String[] args) {
        String str = "akilan Maruthachalam M";
        System.out.println(removeDuplicates(str.toCharArray(), new HashMap<>(), 0, new StringBuilder()));
    }
}
