package com.company;

//Accept long as input from the user
//Print out the name of each whole number primitive type followed by true if the value by the user would fit
//and false otherwise.

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter a number: ");
        long userNumber = userInput.nextLong();

        boolean byte1 = (-128.0 <= userNumber && userNumber <= 127.0);
        boolean int1 = (-2147483648.0 <= userNumber && userNumber <= 2147483647.0);
        boolean short1 = (-32768.0 <= userNumber && userNumber <= 32767.0);

        System.out.println("Your number will fit within a byte: " + byte1);
        System.out.println("Your number will fit within an integer: " + int1);
        System.out.println("Your number will fit within a short: " + short1);

    }
}
