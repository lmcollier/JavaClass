package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printSum(4, 6);
        printSum(7, 2);
    }

    private static void printSum(int a, int b)
    {
        int total = a + b;
        System.out.println(a + " + " + b + " = " + total);
    }

}
