package com.company;

//if given two whole numbers, calculate dimensions of floor to order #of boxes of tile to cover floor
//add 10% to the number of tiles for wastage -- wastage of partial tiles can be ignored
//Tiles per box = 8 and each tile covers a 1 by 1 area
//A 5x8 floor should be 6 boxes
//A 10x8 floor should be 11 boxes

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please enter the first whole number for the floor area: ");
        double firstNumber = userInput.nextDouble();
        System.out.println("Please enter the second whole number for the floor area: ");
        double secondNumber = userInput.nextDouble();

        double floorArea = firstNumber*secondNumber;
        System.out.println("The area of the floor is " + floorArea + " square units.");

        double boxesNeed = floorArea/8;
        double wastage = (boxesNeed*0.10)*8;
        System.out.println("The number of tiles needed for wastage is " + wastage + ".");

        if (wastage > 0)
        {
            boxesNeed++;
            if (wastage > 8)
            {
                boxesNeed++;
            }
        }

        boxesNeed = (int)boxesNeed;

        System.out.println("We need " + boxesNeed + " boxes of tile to cover the floor.");

    }
}
