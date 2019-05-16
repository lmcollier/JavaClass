package com.company;

/*Ask user to enter a character first and then a number
 * The program should print valid or invalid */

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userLetter = new java.util.Scanner(System.in);
        System.out.println("Please pick an uppercase letter: ");

        char letter = userLetter.next().charAt(0);

        java.util.Scanner userNumber = new java.util.Scanner(System.in);
        System.out.println("Please pick a number: ");

        int number = userNumber.nextInt();

        boolean numbersB = (1 <= number && number <= 15);
        boolean numbersI = (16 <= number && number <= 30);
        boolean numbersN = (31 <= number && number <= 45);
        boolean numbersG = (46 <= number && number <= 60);
        boolean numbersO = (61 <= number && number <= 75);

        if (letter == 'B')
        {
            if (numbersB)
            {
                System.out.println("This is a valid number.");
            }
            else
            {
                System.out.println("This is an invalid number.");
            }

        }

        if (letter == 'I')
        {
            if (numbersI)
            {
                System.out.println("This is a valid number.");
            }
            else
            {
                System.out.println("This is an invalid number.");
            }

        }

        if (letter == 'N')
        {
            if (numbersN)
            {
                System.out.println("This is a valid number.");
            }
            else
            {
                System.out.println("This is an invalid number.");
            }

        }

        if (letter == 'G')
        {
            if (numbersG)
            {
                System.out.println("This is a valid number.");
            }
            else
            {
                System.out.println("This is an invalid number.");
            }

        }

        if (letter == 'O')
        {
            if (numbersO)
            {
                System.out.println("This is a valid number.");
            }
            else
            {
                System.out.println("This is an invalid number.");
            }

        }

    }
}
