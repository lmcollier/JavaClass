package com.company;

//use your initials again
//create variable int named offset to use for a Caesar cipher
//offset = 5
//decrement your three encoded variables
//Should see three original variables

public class Main
{
    public static void main(String[] args)
    {
        int offset = 5;

        char first = 'Q';
        char middle = 'R';
        char last = 'H';

        first -= offset;
        middle -= offset;
        last -= offset;

        if (first > 'Z')
        {
            first -= 26;
        }

        if (middle > 'Z')
        {
            middle -= 26;
        }

        if (last > 'Z')
        {
            last -= 26;
        }

        System.out.println(first);
        System.out.println(middle);
        System.out.println(last);
    }
}
