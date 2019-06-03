package com.company;

import java.util.ArrayList;

public class SimpleList
{
    public void demo ()
    {
        ArrayList<String> list =  new ArrayList<>();

        list.add("Red");
        list.add("Orange");
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");

        int sum = 0;
        int sum2 = 0;

        while (list.size() > sum)
        {
            sum++;
            System.out.println(list.get(sum - 1));
        }

        for (String colors: list)
        {
            System.out.println(colors);
        }

        for (String colors: list)
        {
            sum2++;
            System.out.println("The color at index " + (sum2 - 1) + " is: " + colors);
        }
    }
}
