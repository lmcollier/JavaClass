package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int triangleSideCount = getTriangleSideCount();
        System.out.println("The number of sides a triangle has is: " + triangleSideCount);

        int squareSideCount = getSquareSidesCount();
        System.out.println("The number of sides a square has is: " + squareSideCount);
    }

    private static int getTriangleSideCount()
    {
        return 3;
    }

    private static int getSquareSidesCount()
    {
        return 4;
    }
}
