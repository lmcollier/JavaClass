package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please enter a number:");
        int number1 = userInput.nextInt();
        System.out.println("Please enter another number:");
        int number2 = userInput.nextInt();

        if ((number1 % 2 != 0) && (number2 % 2 != 0))
        {
            int total = number1 + number2;
            System.out.println("Two odds make an even and that even number is: " + total);
        }
        else if ((number1 % 2 == 0) && (number2 % 2 == 0))
        {
            int total = number1 + number2;
            System.out.println("Two evens make an even and that even number is: " + total);
        }
        else
        {
            if (number1 % 2 != 0)
            {
                System.out.println("The odd number is: " + number1);
            }
            else
            {
                System.out.println("The even number is: " + number1);
            }
            if (number2 % 2 != 0)
            {
                System.out.println("The odd number is: " + number2);
            }
            else
            {
                System.out.println("The even number is: " + number2);
            }
        }
    }
}
