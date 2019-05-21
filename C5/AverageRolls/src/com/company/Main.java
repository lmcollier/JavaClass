package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printAverage(3);
    }

    private static void printAverage(int rolls)
    {
        double average = 0;
        double sum = 0;
        double total = 0;

        for (int count = 0; count < rolls; count++)
        {
            java.util.Random random = new java.util.Random();
            int number = random.nextInt(20);
            System.out.println(number);
            total = sum += number;
            average = total/rolls;
        }
        System.out.println("Your total is: " + total);
        System.out.println("Your total is: " + average);

    }
}
