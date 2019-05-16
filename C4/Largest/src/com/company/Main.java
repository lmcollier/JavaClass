package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please enter a number:");
        int number1 = userInput.nextInt();

        System.out.println("Please enter a number:");
        int number2 = userInput.nextInt();


        if (number1 > number2)
        {
            System.out.println("The largest number is: " + number1);
        }
        else if (number1 < number2)
        {
            System.out.println("The largest number is: " + number2);
        }
        else
        {
            System.out.println("The numbers are equal.");
        }
    }
}
