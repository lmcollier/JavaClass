package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int month = 2;
        int year = 2016;
        int num = 31;

        switch (month)
        {

            case 2:
                num = (year % 4 == 0)? 29: 28;
                break;

            case 4: case 6: case 9: case 11:
                num = 30;
                break;
        }
        System.out.println(month + "/" + year + ": " + num + " days");
    }
}
