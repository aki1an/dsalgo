package io.akil4n.Recursion;

public class PrintN {
    static void print1toN(int N){
        if(N == 0) return;
        print1toN(N-1);
        System.out.println(N);
    }
    static void printNto1(int N){
        if(N == 0) return;
        System.out.println(N);
        printNto1(N-1);
    }

    public static void main(String... args){
        print1toN(10);
        System.out.println("\n-----------\n");
        printNto1(10);
    }
}
