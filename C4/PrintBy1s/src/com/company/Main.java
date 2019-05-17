package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int number = 1;

        while (number <= 10)
        {
            System.out.println(number++);
        }

        number = 10;

        while (number >= 1)
        {
            System.out.println(number--);
        }
    }

}
