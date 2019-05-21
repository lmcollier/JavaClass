package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printRandomNumber(1);
        printRandomNumber(5);
        printRandomNumber(10);
    }

    private static void printRandomNumber(int max)
    {
        java.util.Random random = new java.util.Random();
        int number = random.nextInt(max);

        System.out.println(number);
    }
}
