package com.company;

//        Write a code fragment that puts the binary representation of a positive integer N
//        into a String s.

//        Answer:

//        Java has a built-in method Integer.toBinaryString(N) for this job, but
//        the point of the exercise is to see how such a method might be implemented. Here is a
//        particularly concise solution:
//
//        String s = "";
//        for (int n = N; n > 0; n /= 2)
//        s = (n % 2) + s;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int N = 2;
        String s = "";
        for (int n = N; n > 0; n /= 2)
        s = (n % 2) + s;
        System.out.println(s);
    }
}
