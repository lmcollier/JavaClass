package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //Page 44

        if (5 > 1)
        {
            System.out.println("Five is greater than one.");
        }

        if (2 < 4)
        {
            System.out.println("Two is less than four.");
            System.out.println("Test succeeded.");
        }

        //Page 45

        int num = 8;

        if (((num > 5) && (num < 10)) || (num ==12));
        {
            System.out.println("Number is 6-9 inclusive, or 12.");
        }

        num = 3;

        if (((num > 5) && (num < 10)) || (num ==12));
        {
            System.out.println("Number is 6-9 inclusive, or 12.");
        }

        //Page 46-47

        int hrs = 21;

        if (hrs < 13)
        {
            System.out.println("Good morning: " + hrs);
        }
        else if (hrs < 18)
        {
            System.out.println("Good afternoon: " + hrs);
        }
        else System.out.println("Good evening: " + hrs);

    }
}
