package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main
{

    public static void main(String[] args)
    {
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("One");
        myQueue.add("Two");
        myQueue.add("Three");
        myQueue.add("Four");
        myQueue.add("Five");

        System.out.println(myQueue);

        System.out.println("The next number is: " + myQueue.peek());
        System.out.println("The next number is: " + myQueue.peek());
        System.out.println("The next number is: " + myQueue.peek());
        System.out.println("The next number is: " + myQueue.peek());
        System.out.println("The next number is: " + myQueue.peek());


    }
}
