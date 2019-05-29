package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Clock clock = new Clock(9, 34, false);
        printTimeSummary(clock);

    }

    private static void printTimeSummary(Clock clock)
    {
        System.out.println("Time: " + clock.getHour() + ":" + clock.printMinutes());
        System.out.println("Military Time: " + clock.getMilitaryTime());
        System.out.println("Time: " + clock.getTime());
        System.out.println("Time: " + clock.incrementMinute());
        clock.setAlarmTime(9,35);
        clock.turnAlarmOn();
        System.out.println("Time: " + clock.incrementHour());
        clock.setAlarmTime(10,35);
        clock.turnAlarmOff();
        System.out.println("------------------------------------------------");
    }
}


