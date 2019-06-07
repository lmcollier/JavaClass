package com.company;

import java.util.HashMap;

public class TimeZoneDemo
{
    HashMap<String, Integer> timeZone = new HashMap<>();

    public void demo()
    {
        timeZone.put("EST", -5);
        timeZone.put("CST", -6);
        timeZone.put("MST", -7);
        timeZone.put("PST", -8);
        timeZone.put("GMT", 0);
    }

    public void getTimeDiff(String one, String two)
    {
       int firstTZone = timeZone.get(one);
       int secondTZone =timeZone.get(two);
       int difference = firstTZone - secondTZone;
;       System.out.println("The difference between " + one + " and " + two + " is " + difference + " hours.");
    }
}
