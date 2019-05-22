package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int allTogether = absoluteSum(10, -20);
        System.out.println("The sum is: " + allTogether);

        allTogether = absoluteSum(0, -1);
        System.out.println("The sum is: " + allTogether);

        allTogether = absoluteSum(-12, 12);
        System.out.println("The sum is: " + allTogether);

    }

    private static int absoluteSum (int a, int b)
    {
        int x = Math.abs(a);
        int y = Math.abs(b);
        int sum = x + y;

        return sum;

        private static int absoluteSum (int c, int d, int e)
        {
            int t = Math.abs(c);
            int u = Math.abs(d);
            int v = Math.abs(e);

            sum = t + u + v;

            return sum;
        }
    }
}
