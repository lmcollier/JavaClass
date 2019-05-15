package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int x = -1;
        boolean compare = (0 <= x && x <= 11);
        System.out.println(compare);

        x = 0;
        compare = (0 <= x && x <= 11);
        System.out.println(compare);

        x = 1;
        compare = (0 <= x && x <= 11);
        System.out.println(compare);

        x = 10;
        compare = (0 <= x && x <= 11);
        System.out.println(compare);

        x = 11;
        compare = (0 <= x && x <= 11);
        System.out.println(compare);

        x = 12;
        compare = (0 <= x && x <= 11);
        System.out.println(compare);
    }
}
