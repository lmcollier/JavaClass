package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printRange(250, 140);
    }

    private static void printRange(double a, double b)
    {
        double trailerWeight = a;
        double cargoWeight = b;

        double totalWeight = trailerWeight + cargoWeight;
        double minWeight = (totalWeight * 0.09);
        double maxWeight = (totalWeight * 0.15);

        System.out.println("The tongue weight is " + minWeight + " pounds min and " + maxWeight + " pounds max.");
    }
}
