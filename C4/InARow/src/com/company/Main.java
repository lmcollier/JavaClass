package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please enter a number.");
        int number1 = userInput.nextInt();

        System.out.println("Please enter another number:");
        int number2 = userInput.nextInt();

        System.out.println("Please enter another number:");
        int number3 = userInput.nextInt();

        //DO NOT use ++ when trying to increment!!

        if (number2 == (number1 + 1))
        {
            if (number3 == (number1 + 2))
            {
                System.out.println("In a Row!");
            }
            else
            {
                System.out.println("Not in a Row!");
            }
        }
        else
        {
            System.out.println("Not in a Row!");
        }
    }
}
