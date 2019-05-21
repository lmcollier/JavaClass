package com.company;

import java.sql.SQLOutput;

public class Main
{

    public static void main(String[] args)
    {
        printHeader();

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter your birth year: ");
        int birthYear = input.nextInt();

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        System.out.println("Please enter your 5 digit employee number: ");
        int employeeNumber = input.nextInt();


        printName(lastName, firstName);
        printAge(birthYear);
        boolean even = (employeeNumber % 2 == 0);
        System.out.println("Employee number is even: " + even);
        printGeneratedSecretPassword(employeeNumber);

    }

    private static void printHeader ()
    {
        System.out.println("Welcome to the WallabyTech Employee Application");
        System.out.println("===============================================");
    }

    private static void printName (String last, String first)
    {
        System.out.println(last + ", " + first);
    }

    private static void printAge (int c)
    {
        int age = 2019 - c;
        System.out.println("Your age is: " + age);
    }

    private static void printGeneratedSecretPassword (int d)
    {
        int min = 1;
        int max = 10;
        java.util.Random random = new java.util.Random();
        int number = random.nextInt(max + 1 - min) - min;
        int password = (d * number)*5;
        System.out.println("Employee's random secret password is: " + password);
    }
}
