package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please pick a number: ");
        int maxCount = userInput.nextInt();

        int startAt = 1;

        while (startAt <= maxCount)
        {
            System.out.println(startAt++);
        }
    }
}
