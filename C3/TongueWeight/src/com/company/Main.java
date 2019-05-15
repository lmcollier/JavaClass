package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter the trailer weight: ");
        double trailerWeight = userInput.nextDouble();

        System.out.println("Please enter the cargo weight: ");
        double cargoWeight = userInput.nextDouble();

        double totalWeight = trailerWeight + cargoWeight;

        double minWeight = (totalWeight * 0.09);
        double maxWeight = (totalWeight * 0.15);

        System.out.println("The tongue weight is " + minWeight + " pounds min and " + maxWeight + " pounds max.");

    }
}
