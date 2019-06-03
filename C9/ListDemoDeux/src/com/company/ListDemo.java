package com.company;

import java.util.ArrayList;

public class ListDemo
{
    public void execute ()
    {
        ArrayList <String> list = new ArrayList<>();
        list.add("Couch");
        list.add("Chair");
        list.add("Bed");
        list.add("Fridge");
        list.add(0, "Rocking Chair");

        list.remove(4);
        list.remove(0);
        list.remove(2);

        printList(list);
    }

    public void printList(ArrayList<String> list)
    {
        int sum = 0;

        for (String furniture : list)
        {
            sum++;

            if (list.size() == sum)
            {
                System.out.print(furniture);
            }
            else
            {
                System.out.print(furniture + " : ");
            }
        }
    }
}
