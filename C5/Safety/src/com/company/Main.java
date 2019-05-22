package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int neighborhoodSpeed = safeSpeed(0);
        System.out.println("You need to reduce speed by " + neighborhoodSpeed + " mph!");

        neighborhoodSpeed = safeSpeed(14);
        System.out.println("You need to reduce speed by " + neighborhoodSpeed + " mph!");

        neighborhoodSpeed = safeSpeed(15);
        System.out.println("You need to reduce speed by " + neighborhoodSpeed + " mph!");

        neighborhoodSpeed = safeSpeed(16);
        System.out.println("You need to reduce speed by " + neighborhoodSpeed + " mph!");

        neighborhoodSpeed = safeSpeed(55);
        System.out.println("You need to reduce speed by " + neighborhoodSpeed + " mph!");

    }

    private static int safeSpeed (int neighborhoodSpeed)
    {
        if (neighborhoodSpeed > 15)
        {
            return neighborhoodSpeed - 15;
        }
        else
        {
            return 0;
        }

    }
}
