package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Date date = new Date(2, 3, 1967);
        System.out.println("Date: " + date.getMonth() + "/" + date.getDay() + "/" + date.getYear());
        date.getFormattedDate();

        date = new Date(29, 12, 2019);
        System.out.println("Date: " + date.getMonth() + "/" + date.getDay() + "/" + date.getYear());
        date.getFormattedDate();


    }
}
