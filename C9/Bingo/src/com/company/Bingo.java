package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Bingo
{
    HashSet<Integer> numbers = new HashSet<>();

    public void run()
    {
        printMenu();
        Scanner input = new Scanner(System.in);
        boolean keepRunning = true;

        do
        {
            String command = input.next().toUpperCase();

            switch (command)
            {
                case "CALL":
                    int value = input.nextInt();
                    call(value);
                    break;
                case "CALLED":
                    called();
                    break;
                case "VERIFY":
                    value = input.nextInt();
                    verify(value);
                    break;
                case "CHALLENGE":
                    value = input.nextInt();
                    challenge(value);
                    break;
                case "BINGO":
                    clear();
                    break;
                case "EXIT":
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid Command");
                    break;
            }

        }
        while (keepRunning);

    }

    private void call(int value)
    {
        if (1 <= value && value <= 75)
        {
            if (numbers.contains(value))
            {
                System.out.println("Already Called!");
            }
            else
            {
                numbers.add(value);
                System.out.println("Added " + value);
            }
        }
    }

    private void called()
    {
        for (Integer list : numbers)
        {
            System.out.println(list);
        }
    }

    private void verify(int value)
    {
        if (1 <= value && value <= 75)
        {
            if (numbers.contains(value))
            {
                System.out.println("Already Called!");
            }
            else
            {
                System.out.println("Not Called!");
            }
        }
    }

    private void challenge(int value)
    {
        if (1 <= value && value <= 75)
        {
            numbers.remove(value);
        }
    }

    private void clear()
    {
        if (numbers.size() < 4)
        {
            System.out.println("Cheater!!");
            numbers.clear();
        }
        else
        {
            System.out.println("Congratulations! You win a fruit cake!");
            numbers.clear();
        }
    }

    private void printMenu()
    {
        System.out.print("\n");
        System.out.println("Please choose from the following options: ");
        System.out.println("     CALL <number> to add number.");
        System.out.println("     CALLED to print list of called numbers.");
        System.out.println("     VERIFY <number> to see if a number has been called.");
        System.out.println("     CHALLENGE to remove a called number.");
        System.out.println("     BINGO to clear the board.");
        System.out.println("     EXIT to leave the game.");
        System.out.println("-----------------------------------------------------");
    }

}