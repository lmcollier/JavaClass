package com.company;

import java.sql.SQLOutput;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please enter a ticket number:");

        int ticketNumber = userInput.nextInt();
        int lastDigit = ticketNumber % 10;
        int ticketPrefix = ticketNumber/10;
        int compare = ticketPrefix % 7;

        System.out.println("The last digit of the ticket is: " + lastDigit);
        System.out.println("The ticket prefix is: " + ticketPrefix);
        System.out.println("The ticket prefix divided by 7: " + compare);

        boolean goodTicket = (compare == lastDigit);

        if (goodTicket)
        {
            System.out.println("This is a good number.");
        }
        else
        {
            System.out.println("This is a bad number.");
        }
    }
}
