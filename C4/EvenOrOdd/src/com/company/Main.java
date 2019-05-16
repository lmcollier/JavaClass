package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please enter a number:");

        int number = userInput.nextInt();

        if (number % 2 == 0)
        {
            System.out.println("The number is even.");
        }
        else
        {
            System.out.println("The number is odd.");
        }
    }
}
