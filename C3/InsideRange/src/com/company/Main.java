package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int x = 0;
        boolean compare = (0 < x && x < 6);
        System.out.println(compare);

        x = 1;
        compare = (0 < x && x < 6);
        System.out.println(compare);

        x = 4;
        compare = (0 < x && x < 6);
        System.out.println(compare);

        x = 5;
        compare = (0 < x && x < 6);
        System.out.println(compare);

        x = 6;
        compare = (0 < x && x < 6);
        System.out.println(compare);

        x = 10;
        compare = (0 < x && x < 6);
        System.out.println(compare);

        // Another way to do inside and outside a range
        // int x = -1;
        // boolean insideRange = (0 < x && x < 6);
        // boolean outsideRange = !insideRange;
        // System.out.println(outsideRange)
    }
}
