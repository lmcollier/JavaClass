package com.company;

public class Date
{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public void getFormattedDate()
    {
        if (month < 9)
        {
            if (day < 9)
            {
                System.out.println(year + "-0" + month + "-0" + day);
            }
            else
            {
                System.out.println(year + "-0" + month + "-" + day);
            }
        }
        else
        {
            if (day < 9)
            {
                System.out.println(year + "-" + month + "-0" + day);
            }
            else
            {
                System.out.println(year + "-" + month + "-" + day);
            }
        }

    }


}
