package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int number = 108;

        while (number > 20)
        {
            System.out.println(number -= 8);
        }

        number = -20;

        while (number > -100)
        {
            System.out.println(number -= 8);
        }
    }
}
