package com.company;

public class Clock
{
    private int hour;
    private int minute;
    private int hourAlarm;
    private int minuteAlarm;
    private boolean pm;
    private boolean alarmOn = true;

    public Clock(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }

    public Clock(int hour, int minute, boolean pm)
    {
        this.hour = hour;
        this.minute = minute;
        this.pm = pm;

        if (!pm)
        {
            hour = hour - 12;
        }
    }

    public int getHour()
    {
        return hour;
    }

    public int getMinute()
    {
        return minute;
    }

    public int getHourAlarm()
    {
        return hourAlarm;
    }

    public int getMinuteAlarm()
    {
        return minuteAlarm;
    }

    public boolean isAlarmOn()
    {
        return alarmOn;
    }

    public String printMinutes()
    {
        if (minute < 9)
        {
            String.valueOf(minute);
            return "0" + minute;
        }
        else
        {
            String.valueOf(minute);
            return "" + minute;
        }
    }

    public String getMilitaryTime()
    {
        if (hour < 12)
        {
            if (minute < 9)
            {
                String.valueOf(minute);
                String.valueOf(hour);
                return ("0" + hour + ":" + "0" + minute);
            }
            else
            {
                String.valueOf(minute);
                String.valueOf(hour);
                return ("0" + hour + ":" + minute);
            }
        }
        else
        {
            if (minute < 9)
            {
                String.valueOf(minute);
                String.valueOf(hour);
                return (hour + ":" + "0" + minute);
            }
            else
            {
                String.valueOf(minute);
                String.valueOf(hour);
                return (hour + ":" + minute);
            }
        }
    }

    public String getTime()
    {
        if (!pm)
        {
            return amMinutes();
        }
        else
        {
            if (minute < 9)
            {
                if (hour != 12)
                {
                    hour = hour - 12;
                    String.valueOf(minute);
                    String.valueOf(hour);
                }
                return (hour + ":" + "0" + minute + " PM");
            }
            else
            {
                if (hour != 12)
                {
                    hour = hour - 12;
                    String.valueOf(minute);
                    String.valueOf(hour);
                }
                return (hour + ":" + minute + " PM");
            }
        }
    }

    public String incrementHour()
    {
        hour++;

        if (!pm)
        {
            return amMinutes();
        }
        else
        {
            return pmMinutes();
        }
    }

    public String decrementHour()
    {
        hour--;

        if (!pm)
        {
            return amMinutes();
        }
        else
        {
           return pmMinutes();
        }
    }

    public String incrementMinute()
    {
        minute++;

        if (minute == 60)
        {
            hour++;
            minute = 0;

            if (!pm)
            {
               return amMinutes();
            }
            else
            {
                return pmMinutes();
            }
        }
        else
        {
            if (!pm)
            {
                return amMinutes();
            }
            else
            {
                return pmMinutes();
            }
        }
    }

    public String decrementMinute()
    {
        minute--;

        if (minute == -1)
        {
            hour--;
            minute = 59;

            if (!pm)
            {
                return amMinutes();
            }
            else
            {
                return pmMinutes();
            }
        }
        else
        {
            if (!pm)
            {
                return amMinutes();
            }
            else
            {
                return pmMinutes();
            }
        }
    }

    public void setAlarmTime(int hourAlarm, int minuteAlarm)
    {
        this.hourAlarm = hourAlarm;
        this.minuteAlarm = minuteAlarm;
    }

    public void buzz(boolean alarmOn)
    {
        if (alarmOn)
        {
            setAlarmTime(9,30);
            System.out.println("BUZZ");
        }
    }

    public void turnAlarmOn()
    {
        alarmOn = true;
        buzz(true);

    }

    public void turnAlarmOff()
    {
        alarmOn = false;
        buzz(false);
    }

    public String pmMinutes()
    {
        if (minute < 9)
        {
            if(hour > 12)
            {
                hour = hour - 12;
                String.valueOf(minute);
                String.valueOf(hour);
                return (hour + ":" + "0" + minute + " PM");
            }
            else
            {
                String.valueOf(minute);
                String.valueOf(hour);
                return (hour + ":" + "0" + minute + " PM");
            }

        }
        else
        {
            if(hour > 12)
            {
                hour = hour - 12;
                String.valueOf(minute);
                String.valueOf(hour);
                return (hour + ":" + minute + " PM");
            }
            else
            {
                String.valueOf(minute);
                String.valueOf(hour);
                return (hour + ":" + minute + " PM");
            }
        }
    }

    public String amMinutes()
    {
        if (minute < 9)
        {
            String.valueOf(minute);
            String.valueOf(hour);
            return (hour + ":" + "0" + minute + " AM");
        }
        else
        {
            String.valueOf(minute);
            String.valueOf(hour);
            return (hour + ":" + minute + " AM");
        }
    }

}
