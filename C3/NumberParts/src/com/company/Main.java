package com.company;

public class Main
{

    public static void main(String[] args)
    {
        double x = 3.25;
        int whole = (int)x;
        double fraction = x - whole;

        System.out.println("Whole part: " + whole);
        System.out.println("Fractional part: " + fraction);
    }
}
