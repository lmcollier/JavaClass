package com.company;

public class Boat
{
    private int smallFish = 0;
    private int mediumFish = 0;
    private int bigFish = 0;
    private int totalWeight = 0;


    public void caughtSmallFish()
    {
        smallFish++;
        System.out.println("The number of small fish is: " + smallFish);
    }

    public void caughtSmallFish(int quantity)
    {
        smallFish += quantity;
        System.out.println("The number of small fish is: " + smallFish);
    }

    public void caughtMediumFish()
    {
        mediumFish++;
        System.out.println("The number of medium fish is: " + mediumFish);
    }

    public void caughtMediumFish(int quantity)
    {
        mediumFish += quantity;
        System.out.println("The number of medium fish is: " + mediumFish);
    }

    public void caughtBigFish()
    {
        bigFish++;
        System.out.println("The number of big fish is: " + bigFish);
    }

    public void caughtBigFish(int quantity)
    {
        bigFish += quantity;
        System.out.println("The number of small fish is: " + bigFish);
    }

    public int getTotalWeight()
    {
        totalWeight = smallFish;
        totalWeight += 5 * mediumFish;
        totalWeight += 10 * bigFish;
        return totalWeight;
    }

    public boolean isCloseToSinking ()
    {
        return getTotalWeight() > 200;
    }

    public boolean isSunk()
    {
        return getTotalWeight() > 210;
    }
}
