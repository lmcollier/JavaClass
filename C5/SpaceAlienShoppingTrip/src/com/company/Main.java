package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int count = 0;

        printHello();

        while (count < 3)
        {
            goShopping();
            count++;
        }

        printGoodbye();
    }

    private static void printHello()
    {
        System.out.println("Hello, Earthlings!");
    }

    private static void printGoodbye()
    {
        System.out.println("Goodbye, Earthlings!");
    }

    private static void goShopping()
    {
        System.out.println("Shopping likes it's 1999!");
    }
}
