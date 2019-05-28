package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Boat minnow = new Boat();
        System.out.println("New boat!");
        printBoatSummary(minnow);

        minnow.caughtSmallFish(6);
        minnow.caughtMediumFish(7);
        minnow.caughtBigFish(9);
        printBoatSummary(minnow);

        minnow.caughtSmallFish(5);
        minnow.caughtMediumFish(3);
        minnow.caughtBigFish(5);
        printBoatSummary(minnow);

        minnow.caughtSmallFish(8);
        minnow.caughtMediumFish(15);
        minnow.caughtBigFish(7);
        printBoatSummary(minnow);

    }

    private static void printBoatSummary(Boat boat)
    {
        System.out.println("The total weight is: " + boat.getTotalWeight());
        System.out.println("Close to sinking? " + boat.isCloseToSinking());
        System.out.println("Sunk? " + boat.isSunk());
        System.out.println("------------------------------------------------");

    }
}
