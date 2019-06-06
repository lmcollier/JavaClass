package com.company;

import java.util.Stack;

public class SimpleStack
{

    public void run()
    {
        Stack<String> myStack = new Stack<>();
        myStack.push("One");
        myStack.push("Two");
        myStack.push("Three");
        myStack.push("Four");
        myStack.push("Five");

        System.out.println(myStack);

        myStack.pop();

        System.out.println(myStack);

        myStack.peek();
        myStack.peek();
        myStack.peek();
        myStack.peek();
        myStack.peek();

        System.out.println(myStack);

    }



}
