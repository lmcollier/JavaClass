package com.company;

public class ArrayUtil
{
    public static void printArray(int[] values)
    {
        for (int value: values)
        {
            System.out.println(value);
        }
    }

    public static void printArrayString(String[] values)
    {
        for (String value: values)
        {
            System.out.println(value);
        }
    }

    public static int arrayTotal(int[] values)
    {
        int sum = 0;

        for(int value: values)
        {
            sum += value;
        }

        return sum;
    }

    public static int arrayMax(int[] values)
    {
        int max = values[0];

        for (int value : values)
        {
            if (value > max)
            {
                max = value;
            }
        }

        return max;
    }

    public static int arrayMaxIndex(int[] values)
    {
        int max = values[0];
        int currentIndex = 0;
        int maxIndex = 0;

        for (int value : values)
        {
            if (value > max)
            {
                max = value;
                maxIndex = currentIndex;
            }

            currentIndex++;
        }

        return maxIndex;
    }

    public static int arrayAverage(int[] values)
    {
        int sum = 0;

        for(int value: values)
        {
            sum += value;
        }
        int average = (sum / 2);
        return average;
    }

}
