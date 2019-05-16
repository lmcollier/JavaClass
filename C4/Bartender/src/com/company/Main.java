package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please choose your drink: 1 = water, 2 = coke, 3 = Glen Rio Ale.");

        int choice = userInput.nextInt();

        if (choice == 1)
        {
            System.out.println("Here is your water.");
        }
        else if (choice == 2)
        {
            System.out.println("Here is your coke.");
        }
        else
        {
            java.util.Scanner userAge = new java.util.Scanner(System.in);
            System.out.println("What is your age?");
            int age = userAge.nextInt();

            if (age > 21)
            {
                System.out.println("Here is your Glen Rio Ale.");
            }
            else
            {
                int under = 21 - age;
                if (under > 1)
                {
                    System.out.println("No drink for you! Come back in " + under + " years!");
                }
                else
                {
                    System.out.println("No drink for you! Come back in " + under + " year!");
                }
            }
        }
    }
}
