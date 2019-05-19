package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        int userNumber;

        int sum = 0;
        int total = 0;

        do
        {
            System.out.println("Please pick a number: ");
            userNumber = userInput.nextInt();
            total += userNumber;
            sum++;
        }
        while(total < 500);

        System.out.println("You reached a total of " + total + " to finally obtain a total greater than 500.");

        if (sum > 1)
        {
            System.out.println("You entered " + sum + " numbers.");
        }
        else
        {
            System.out.println("You entered " + sum + " number.");
        }

    }
}
