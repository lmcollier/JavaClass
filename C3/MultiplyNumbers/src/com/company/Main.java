package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("I will multiply two numbers. Please enter the first number: ");
        double firstNumber = userInput.nextDouble();

        System.out.println("Please enter the second number: ");
        double secondNumber = userInput.nextDouble();

        double product = firstNumber * secondNumber;

        System.out.println("The product of " + firstNumber + " and " + secondNumber + " is " + product);
    }
}
