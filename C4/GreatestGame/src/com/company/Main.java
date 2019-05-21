package com.company;

public class Main
{

    public static void main(String[] args)
    {
        // Bronze Exercise

        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("What is your name?");
        String name = userInput.next();

        java.util.Random random = new java.util.Random();
        int number = random.nextInt(100);

        System.out.println("Please guess any number from 1 to 100: ");
        int guess = userInput.nextInt();

        int sum = 1;

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

        // Silver Exercise

        int sum1 = 1;
        int sum2 = 1;
        int games1 = 0;
        int games2 = 0;
        int totalGames = games1 + games2;
        int average1 = sum1/games1;
        int average2 = (sum1 + sum2)/games2;

        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("What is your name?");
        String name = userInput.next();

        java.util.Random random = new java.util.Random();
        int number = random.nextInt(100);

        System.out.println("Please guess any number from 1 to 100: ");
        int guess = userInput.nextInt();

        int sum = 1;

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
            System.out.println("Congratulations " + name + ", you have guessed the correct number! It took you " + sum2 +
                    " to guess the correct number! You have played " + totalGames + " and your average number of guesses " +
                    "is " + average2 + ".");
        }
        // Gold Exercise
    }
}
