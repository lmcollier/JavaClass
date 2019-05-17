package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int number = -10;

        while (number < 100)
        {
            System.out.println(number += 10);
        }
        number = 110;

        while (number > 0)
        {
            System.out.println(number -= 10);
        }
    }
}
