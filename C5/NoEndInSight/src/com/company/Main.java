package com.company;

public class Main
{

    public static void main(String[] args)
    {
        sayHelloWorld();
    }

    private static void sayHelloWorld()
    {
        System.out.println("Hello, world!");
        sayHelloWorld();
    }
}
