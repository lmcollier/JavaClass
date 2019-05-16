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

        if (number2 > number1)
        {
            if (number3 > number2)
            {
                System.out.println("In Order!");
            }
            else
            {
                System.out.println("Out of Order!");
            }
        }
        else
        {
            System.out.println("Out of Order!");
        }


    }
}
