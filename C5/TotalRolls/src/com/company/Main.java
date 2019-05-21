package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printTotalRolls(5);
    }

    private static void printTotalRolls(int rolls)
    {
        int total = 0;

        for (int count = 0; count < rolls; count++)
        {
            java.util.Random random = new java.util.Random();
            int number = random.nextInt(20);
            System.out.println(number);
            total += number;
        }

        System.out.println("Your total is: " + total);

    }
}
