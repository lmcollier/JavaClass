package com.company;

public class Main
{

    public static void main(String[] args)
    {
        boolean a = false;
        boolean b = false;
        boolean compare = (a&&b);
        System.out.println("     Truth Table");
        System.out.println("  a      b  |  a && b  ");
        System.out.println("-----------------------");
        System.out.println("false false |  " + compare);

        a = false;
        b = true;
        compare = (a&&b);
        System.out.println("false  true |  " + compare);

        a = true;
        b = false;
        compare = (a&&b);
        System.out.println("true  false |  " + compare);

        a = true;
        b = true;
        compare = (a&&b);
        System.out.println("true  true  |  " + compare);

    }
}
