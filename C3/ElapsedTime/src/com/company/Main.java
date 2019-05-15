package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int totalSeconds = 782683;

        int hour = totalSeconds/3600;
        int noHours = hour * 3600;
        int minutes = (totalSeconds - noHours)/60;
        int noMins = minutes * 60;
        int seconds = totalSeconds - (noHours + noMins);

        System.out.println("After " + totalSeconds + " seconds, " + hour + " hour(s), " + minutes + " minutes, and " +
                seconds + " seconds have elapsed.");
    }
}
