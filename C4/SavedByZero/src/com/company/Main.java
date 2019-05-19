package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userNumber = userInput.nextInt();
        int sum = 0;

        do
        {
            System.out.println("Please enter a number: ");
            userNumber = userInput.nextInt();
            sum++;
        }
        while (userNumber != 0);

        System.out.println("You entered a number other than zero " + sum + " times.");
    }
}
