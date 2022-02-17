package io.akil4n.Recursion;

import java.util.ArrayList;

public class SubsetSums {
    static ArrayList<Integer> sum(ArrayList<Integer> arr, int index, ArrayList<Integer> sums, int sum) {
        if (index < 0) {
            sums.add(sum);
            return sums;
        }
        sum(arr, index - 1, sums, sum + arr.get(index));
        sum(arr, index - 1, sums, sum);
        return sums;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(sum(arrayList,arrayList.size() - 1, new ArrayList<>(), 0));
    }
}
