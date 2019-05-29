package com.company;

public class Spaceship
{
    private String shipName;
    private int passengerCount = 0;

    public Spaceship(String shipName)
    {
        this.shipName = shipName;
    }

    public void addPassenger()
    {
        passengerCount++;
    }

    public void removePassenger()
    {
        passengerCount--;
    }

    public void removeAllPassengers()
    {
        passengerCount = 0;
    }

    public void getShipDescription()
    {
        System.out.println("Ship Name: " + shipName);
        System.out.println("Passenger Count: " + passengerCount);
    }
}
