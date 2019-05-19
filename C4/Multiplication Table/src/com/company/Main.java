package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int table = 5;

        System.out.printf("       ");
        for (int i = 1; i <= table; i++)
        {
            System.out.printf("%4d", i);
        }

        System.out.println();
        System.out.println("       ---------------------");

        for (int firstLine = 1; firstLine <= table; firstLine++)
        {
            System.out.printf("%4d  |", firstLine);
            for (int plier = 1; plier <= table; plier++)
            {
                System.out.printf("%4d", plier*firstLine);
            }
            System.out.println();
        }
    }
}
