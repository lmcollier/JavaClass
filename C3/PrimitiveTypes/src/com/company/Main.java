package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int x = 1;
        int y =2;

        System.out.println(x < y);

        boolean b1 = x < y;
        boolean b2 = false;

        System.out.println(b1 && b2);
        System.out.println(b1 || b2);
        System.out.println(!b2);
    }
}
