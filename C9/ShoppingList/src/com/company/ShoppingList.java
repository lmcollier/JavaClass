package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShoppingList
{
    private ArrayList<String> myList = new ArrayList<>();
    boolean keepRunning = true;

    public void run()
    {
        Scanner input = new Scanner(System.in);

        do
        {
            printMenu();
            String item = input.nextLine();
            String[] words = item.split(" ", 2);
            String action = words[0].toUpperCase();
            int index = -1;

            switch (action)
            {
                case "ADD":
                    myList.add(words[1]);
                    break;
                case "PRINT":
                    for (String items : myList)
                    {
                        index++;
                        System.out.println(index + " : " + items);
                    }
                    break;
                case "REMOVE":
                    myList.remove(Integer.parseInt(words[1]));
                    break;
                case "SORT":
                    Collections.sort(myList);
                    break;
                case "FIND":
                    boolean yes = myList.contains(words[1]);
                    if (yes)
                    {
                        System.out.println("Found It!");
                    }
                    else
                    {
                        System.out.println("No such item!");
                    }
                    break;
                case "CLEAR":
                    myList.clear();
                    break;
                case "EXIT":
                    keepRunning = false;
                    break;
                default:
                    System.out.println("You entered an invalid command. Please try again.");

            }

        } while (keepRunning);
    }

    public void printMenu()
    {
        System.out.print("\n");
        System.out.println("Please choose from the following options: ");
        System.out.println("     ADD and <item name> to add an item to the list.");
        System.out.println("     PRINT to print list.");
        System.out.println("     REMOVE and index number to remove an item.");
        System.out.println("     CLEAR to clear the list.");
        System.out.println("-----------------------------------------------------");
    }


}
