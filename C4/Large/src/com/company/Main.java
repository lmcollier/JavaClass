package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please enter a number.");

        int number = userInput.nextInt();

        if (number > 99)
        {
            System.out.println("The number is large.");
        }
        else
        {
            System.out.println("The number is not large.");
        }
    }
}
