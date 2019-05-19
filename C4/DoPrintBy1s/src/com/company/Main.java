package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int number = 1;

        do
        {
            System.out.println(number++);
        }
        while (number <= 10);

        number = 10;

        do
        {
            System.out.println(number--);
        }
        while (number >= 1);
    }
}
