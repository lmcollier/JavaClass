package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userNumber = userInput.nextInt();

        do
        {
            System.out.println("Please enter a number: ");
            userNumber = userInput.nextInt();
        }
        while (userNumber != 99);

        System.out.println("99, I've been waiting so long!");
    }
}
