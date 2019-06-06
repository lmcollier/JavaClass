package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskHelper
{
    public void run()
    {
        Queue<String> myQueue = new LinkedList<>();
        boolean keepRunning = true;

        Scanner input = new Scanner(System.in);

        do
        {
            printMenu();
            String task = input.nextLine();
            String[] words = task.split(" ", 2);
            String breakApart = words[1];
            String[] multipleTasks = breakApart.split(",");
            String action = words[0].toUpperCase();
            char comma = ',';
            String multiple = String.valueOf(comma);
            Scanner number = new Scanner(System.in);

            switch (action)
            {
                case "ADD":
                    boolean yes = myQueue.contains(words[1]);

                    if (!yes)
                    {
                        if (words[1].contains(multiple))
                        {
                            for (int i = 0; i < multipleTasks.length; i++)
                            {
                                myQueue.add(multipleTasks[i]);
                            }
                        }
                        else
                        {
                            myQueue.add(words[1]);
                        }
                    }
                    else
                    {
                        System.out.println("The task is already on your list!");
                    }
                    break;
                case "PEEK":
                    System.out.println("Task after next: " + myQueue.peek());
                    break;
                case "REMOVE":
                    System.out.println("Task completed: " + myQueue.remove());
                    break;
                case "HOWMANY":
                    System.out.println("Number of tasks remaining: " + myQueue.size());
                    break;
                case "CHECK":
                    yes = myQueue.contains(words[1]);
                    if (yes)
                    {
                        System.out.println("Fortunately, you already know about that one.");
                    }
                    else
                    {
                        System.out.println("Sadly, that task is not on the list.");
                    }
                    break;
                case "WAIT":
                    myQueue.add(myQueue.remove());
                    break;
                case "LIST":
                    System.out.println(myQueue);
                    break;
                case "FLEE":
                    myQueue.clear();
                    break;
                case "EXIT":
                    keepRunning = false;
                    break;
                default:

            }

        } while (keepRunning);

    }

    public void printMenu()
    {
        System.out.print("\n");
        System.out.println("Please choose from the following options: ");
        System.out.println("     ADD <task> to add task.");
        System.out.println("     PEEK for next task.");
        System.out.println("     REMOVE to mark task completed.");
        System.out.println("     HOWMANY shows how many tasks in queue.");
        System.out.println("     CHECK to search tasks.");
        System.out.println("     WAIT to move task to end of queue.");
        System.out.println("     LIST to list remaining tasks.");
        System.out.println("     FLEE to clear the list.");
        System.out.println("     EXIT to exit system.");
        System.out.println("-----------------------------------------------------");
    }
}
