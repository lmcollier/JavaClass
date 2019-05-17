package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please pick number 1 if you ride a bike and 2 if you ride the bus.");
        int transport = userInput.nextInt();

        System.out.println("How long is your commute?");
        int commute = userInput.nextInt();

        boolean free = (commute < 21);
        boolean tenDiscount = (transport == 1) && (commute < 30);
        boolean twentyBusDiscount = (transport == 2) && (commute <= 35);
        boolean twentyBikeDiscount = (transport == 1) && (commute < 50);
        boolean thirtyDiscount = (transport == 2) && (commute < 50);

        if (free)
        {
            System.out.println("Congratulations! Your coffee is free!");
        }
        else if (tenDiscount)
        {
            System.out.println("Congratulations! You get a 10% discount!");
        }
        else if (twentyBusDiscount)
        {
            System.out.println("Congratulations! You get a 20% discount!");
        }
        else if (twentyBikeDiscount)
        {
            System.out.println("Congratulations! You get a 20% discount!");
        }
        else if (thirtyDiscount)
        {
            System.out.println("Congratulations! You get a 30% discount!");
        }
        else
        {
            System.out.println("I'm sorry but you do not get a discount.");
        }
    }
}
