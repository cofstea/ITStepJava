package com.itstep.lesson._7;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(fib(9)); //34
    }

    private static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

}
