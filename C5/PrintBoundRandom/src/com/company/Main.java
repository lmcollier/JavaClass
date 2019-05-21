package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int count = 0;

        while (count < 100)
        {
            count++;
            printRandomNumber(3, 10);
        }
    }

    private static void printRandomNumber(int min, int max)
    {
        java.util.Random random = new java.util.Random();
        int number = random.nextInt(max + 1 - min) + min;

        System.out.println(number);

    }
}
