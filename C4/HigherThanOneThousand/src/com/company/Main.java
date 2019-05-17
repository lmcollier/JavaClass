package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        int userNumber;

        int sum = 0;
        int total = 0;

        while(total < 1000)
        {
            System.out.println("Please pick a number: ");
            userNumber = userInput.nextInt();
            total += userNumber;
            sum++;
        }
        System.out.println("You reached a total of " + total + " to finally obtain a total greater than 1000.");
        System.out.println("You entered " + sum + " numbers.");
    }
}
