package com.company;

public class Main
{

    public static void main(String[] args)
    {

        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("What is your name?");
        String name = userInput.next();

        System.out.println("Would you like to play a guessing game? 1 = Yes, 2 = No");
        int yes = userInput.nextInt();

        java.util.Random random = new java.util.Random();
        int number = random.nextInt(100);

        System.out.println("Please guess any number from 1 to 100: ");
        int guess = userInput.nextInt();

        int sum = 1;

        if (yes == 1)
        {
            while (number != guess)
            {
                while (number < guess)
                {
                    System.out.println("Your guess was too high. Please pick another number from 1 to 100: ");
                    guess = userInput.nextInt();
                    sum++;
                }
                while (number > guess)
                {
                    System.out.println("Your guess was too low. Please pick another number from 1 to 100: ");
                    guess = userInput.nextInt();
                    sum++;
                }
            }

            System.out.println("Congratulations " + name + ", you have guessed the correct number! It took you " + sum +
                    " to guess the correct number!");
        }

        System.out.println("Would you like to play again? 1 = Yes, 2 = No");
    }
}