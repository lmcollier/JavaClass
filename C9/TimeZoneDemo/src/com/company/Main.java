package com.company;

public class Main
{

    public static void main(String[] args)
    {
        TimeZoneDemo timeZoneDemo =  new TimeZoneDemo();

        timeZoneDemo.demo();
        timeZoneDemo.getTimeDiff("PST", "EST");
    }
}
