package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printSum(1,2,3,4,5);
        printSum(2,6,9,3,6);
    }

    private static void printSum(int a, int b, int c, int d, int e)
    {
        int total = a + b + c + d + e;
        System.out.println(a + " + " + b + " + " + c + " + " + d + " + " + e + " = " + total);
    }
}
