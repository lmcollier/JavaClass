package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please pick a number: ");
        int userNumber = userInput.nextInt();
        int sum = 0;

        while(userNumber != 0)
        {
            System.out.println("Please pick another number: ");
            userNumber = userInput.nextInt();
            sum++;
        }
        System.out.println("Congratulations! You entered a number other than zero " + sum + " times!");
    }
}
