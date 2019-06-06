package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.Enumeration;

public class EmergencyTracker
{


    public void run()
    {
        Stack<String> emergencies = new Stack<>();
        boolean keepRunning = true;

        Scanner input = new Scanner(System.in);

        do
        {
            printMenu();
            String emergency = input.nextLine();
            String[] events = emergency.split(" ", 2);
            String action = events[0].toUpperCase();

            switch (action)
            {

                case "ADD":
                    emergencies.add(events[1]);
                    break;
                case "PEEK":
                    System.out.println("Next emergency: " + emergencies.peek());
                    break;
                case "REMOVE":
                    System.out.println("Emergency ended: " + emergencies.pop());
                    System.out.println("Next emergency: " + emergencies.peek());
                    break;
                case "HOWMANY":
                    System.out.println("Number of emergencies remaining: " + emergencies.size());
                    break;
                case "PANIC":
                    emergencies.clear();
                    break;
                case "LIST":
                    Enumeration listFormat = emergencies.elements();
                    while (listFormat.hasMoreElements())
                    {
                        System.out.println(listFormat.nextElement());
                    }
                    break;
                case "ORDER":
                    listFormat = emergencies.elements();
                    int i = emergencies.size() + 1;
                    while (listFormat.hasMoreElements())
                    {
                        i--;
                        System.out.println(i + ": " + listFormat.nextElement());
                    }
                    break;
                case "EXIT":
                    keepRunning = false;
                    break;
            }
        }
        while(keepRunning);
    }

    public void printMenu()
    {
        System.out.print("\n");
        System.out.println("Please choose from the following options: ");
        System.out.println("     ADD <emergency> to add emergency.");
        System.out.println("     PEEK for next emergency.");
        System.out.println("     REMOVE to mark emergencies that have been dealt with.");
        System.out.println("     HOWMANY shows how many emergencies remaining.");
        System.out.println("     LIST to list all emergencies.");
        System.out.println("     ORDER to show list in order.");
        System.out.println("     FLEE to clear the list.");
        System.out.println("     EXIT to exit system.");
        System.out.println("-----------------------------------------------------");
    }
}
