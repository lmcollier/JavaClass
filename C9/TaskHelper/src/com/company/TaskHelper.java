package com.company;

import java.util.*;

public class TaskHelper
{
    Queue<String> myQueue = new LinkedList<>();

    public void run()
    {
        boolean keepRunning = true;

        Scanner input = new Scanner(System.in);
        printMenu();

        do
        {
            String task = input.nextLine();
            String[] words = task.split(" ", 2);
            String action = words[0].toUpperCase();

            switch (action)
            {
                case "ADD":
                    add(words[1]);
                    break;
                case "PEEK":
                    peek();
                    break;
                case "REMOVE":
                    remove();
                    break;
                case "HOWMANY":
                    System.out.println("Number of tasks remaining: " + myQueue.size());
                    break;
                case "CHECK":
                    check(words[1]);
                    break;
                case "WAIT":
                    myQueue.add(myQueue.remove());
                    break;
                case "LIST":
                    list();
                    break;
                case "HALVE":
                    halve();
                    break;
                case "REVERSE":
                    reverse();
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

    private void reverse()
    {
        ArrayList<String> reorder = new ArrayList<>();

        for (String tasks : myQueue)
        {
            reorder.add(tasks);
        }

        Collections.reverse(reorder);

        myQueue.clear();

        for (String tasks : reorder)
        {
            myQueue.add(tasks);
        }

    }

    private void add(String value)
    {
        char comma = ',';
        String multiple = String.valueOf(comma);

        if (!myQueue.contains(value))
        {
            if (value.contains(multiple))
            {
                String breakApart = value;
                String[] multipleTasks = breakApart.split(", ");

                for (int i = 0; i < multipleTasks.length; i++)
                {
                    myQueue.add(multipleTasks[i]);
                }
            }
            else
            {
                myQueue.add(value);
            }
        }
        else
        {
            System.out.println("The task is already on your list!");
        }
    }

    private void peek()
    {
        System.out.println("How many tasks do you want to see?");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (String listFormat : myQueue)
        {
            if (number > 0)
            {
                number--;
                System.out.println("Task after next: " + listFormat);
            }
        }
    }

    private void remove()
    {
        System.out.println("How many tasks do you want to remove?");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = number; i > 0; i--)
        {
            System.out.println("Task completed: " + myQueue.remove());
        }
    }

    private void check(String value)
    {
        if (myQueue.contains(value))
        {
            System.out.println("Fortunately, you already know about that one.");
        }
        else
        {
            System.out.println("Sadly, that task is not on the list.");
        }
    }

    private void list()
    {
        for (String listFormat : myQueue)
        {
            System.out.println(listFormat);
        }
    }

    private void halve()
    {
        boolean everyOther = true;
        ArrayList<String> toRemove = new ArrayList<>();
        for (String tasks : myQueue)
        {
            if (everyOther)
            {
                toRemove.add(tasks);
                everyOther = false;
            }
            else
            {
                everyOther = true;
            }
        }
        myQueue.removeAll(toRemove);
    }

    private void printMenu()
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
        System.out.println("     HALVE to remove every other task.");
        System.out.println("     FLEE to clear the list.");
        System.out.println("     EXIT to exit system.");
        System.out.println("-----------------------------------------------------");
    }

}
