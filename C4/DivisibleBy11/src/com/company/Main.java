package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int x = 1;

        while (x <= 200)
        {
            x++;
            int divisible = x % 11;

            if (divisible == 0)
            {
                boolean elevens = (divisible == 0);
                System.out.println(x);
            }
        }
    }
}
