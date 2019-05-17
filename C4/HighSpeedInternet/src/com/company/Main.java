package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter your internet speed (5M, 10M, 20M, or 50m):");
        String speed = userInput.nextLine();

        String speed5 = "5M";
        String speed10 = "10M";
        String speed20 = "20M";
        String speed50 = "50M";

        System.out.println("Please enter your state (IA, MO, or AR):");
        String state = userInput.nextLine();

        String iowa = "IA";
        String missouri = "MO";
        String arkansas = "AR";

        System.out.println("Your current internet speed is: " + speed + " and you live in: " + state);

        boolean freeUp50 = (state.equals(iowa)) && !(speed.equals(speed50));
        boolean noUp = (state.equals(arkansas));
        boolean freeUp20 = (state.equals(missouri)) && (speed.equals(speed5));
        boolean freeUpMO1 = (state.equals(missouri)) && (speed.equals(speed10));
        boolean freeUpMO2 = (state.equals(missouri)) && (speed.equals(speed20));

        if (freeUp50)
        {
            System.out.println("Congratulations! You will be upgraded to 50M for free!");
        }
        else if (noUp)
        {
            System.out.println("We are sorry but you are not eligible for an upgrade.");
        }
        else if (freeUp20)
        {
            System.out.println("Congratulations! You will be upgraded to 20M for free!");
        }
        else if (freeUpMO1)
        {
            System.out.println("Congratulations! You will be upgraded to 50M for free!");
        }
        else if (freeUpMO2)
        {
            System.out.println("Congratulations! You will be upgraded to 50M for free!");
        }
        else if (speed.equals(speed50))
        {
            System.out.println("We do not have any available packages at speeds greater than 50M.");
        }
        else
        {
            System.out.println("We are sorry but you are not eligible for an upgrade.");
        }
    }
}
