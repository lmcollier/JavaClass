package com.company;

public class Car
{
    private int passengerCount;

    public Car(int passengerCount)
    {
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount()
    {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount)
    {
        if (passengerCount > 0)
        {
            this.passengerCount = passengerCount;
        }

    }


}
