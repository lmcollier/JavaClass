package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("I will add two numbers. Please enter the first number: ");
        double firstNumber = userInput.nextDouble();

        System.out.println("I will add two numbers. Please enter the second number: ");
        double secondNumber = userInput.nextDouble();

        double sum = firstNumber + secondNumber;

        System.out.println("The total of " + firstNumber + " and " + secondNumber + " is " + sum);
    }
}
