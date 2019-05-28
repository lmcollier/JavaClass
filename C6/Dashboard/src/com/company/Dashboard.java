package com.company;

public class Dashboard
{
    private int speed;
    private int rpm;

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public void setRpm(int rpm)
    {
        this.rpm = rpm;
    }

    public String getDisplay()
    {
        return "Speed: " + speed + "   RPM: " + rpm;
    }
}
