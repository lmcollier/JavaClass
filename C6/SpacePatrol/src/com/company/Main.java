package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Spaceship spaceship = new Spaceship("NSEA Protector");

        spaceship.addPassenger();
        spaceship.addPassenger();
        spaceship.addPassenger();
        spaceship.getShipDescription();

        spaceship.removePassenger();
        spaceship.getShipDescription();

        spaceship.removeAllPassengers();
        spaceship.getShipDescription();

    }
}
