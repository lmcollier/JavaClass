package com.company;

//Park goers will get a wrist band to represent height
//red band = rider < 36
//yellow band = 36 < rider < 54
//green band = 54 < rider < 80
//no band = rider > 80

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please enter the rider's height in inches: ");

        int riderHeight = userInput.nextInt();

        if (riderHeight < 36)
        {
            System.out.println("The rider needs a red band.");
        }
        else if (36 < riderHeight && riderHeight < 54)
        {
            System.out.println("The rider needs a yellow band.");
        }
        else if (54 < riderHeight && riderHeight < 80)
        {
            System.out.println("The rider needs a green band.");
        }
        else
        {
            System.out.println("The rider is too tall for the rides and cannot have a band.");
        }
    }
}
