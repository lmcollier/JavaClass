package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please pick a number: ");
        int userNumber = userInput.nextInt();
        int sum = 1;

        while (sum <= 10)
        {
            System.out.println(userNumber + " X " + sum + " = " + (sum*userNumber));
            sum++;
        }
    }
}
