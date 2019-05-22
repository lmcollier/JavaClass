package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String fancyName = getMyFancyName(" ### ");
        System.out.println(fancyName);

        String fancyName2 = getMyFancyName(" $$$ ");
        System.out.println(fancyName2);

        String fancyName3 = getMyFancyName(" *!* ");
        System.out.println(fancyName3);

        int sum = getTotal(10, 20);
        System.out.println(sum);

        sum = getTotal(5, 4);
        System.out.println(sum);

        sum = getTotal(12, 12);
        System.out.println(sum);

        int higher = max(10, 20);
        System.out.println("The higher number is: " + higher);

        higher = max(5, 4);
        System.out.println("The higher number is: " + higher);

        higher = max(12, 12);
        System.out.println("The higher number is: " + higher);

        boolean madMax = isThunderdome(2, 1);
        System.out.println("Thunderdome = " + madMax);

        madMax = isThunderdome(1, 2);
        System.out.println("Thunderdome = " + madMax);

        madMax = isThunderdome(2, 2);
        System.out.println("Thunderdome = " + madMax);

    }

    private static String getMyFancyName(String decoration)
    {
        return decoration + "Larissa" + decoration;
    }

    private static int getTotal(int firstNumber, int secondNumber)
    {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    private static int max(int a, int b)
    {
        if (a < b)
        {
            int higher = b;
            return higher;
        }
        else if ( a > b)
        {
            int higher = a;
            return higher;
        }
        else
        {
            int higher = b;
            return higher;
        }

    }

    private static boolean isThunderdome(int enteredCount, int leavingCount)
    {
        boolean thunderdome = false;

        if (enteredCount == 2 && leavingCount == 1)
        {
            thunderdome = true;
        }

        return thunderdome;

    }


}
