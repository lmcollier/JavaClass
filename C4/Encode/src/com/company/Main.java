package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int offset = 5;

        char first = 'L';
        char middle = 'M';
        char last = 'C';

        first += offset;
        middle += offset;
        last += offset;

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
