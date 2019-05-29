package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Car car = new Car(4);
        System.out.println("There are " + car.getPassengerCount() + " passengers in the car.");

        car.setPassengerCount(6);
        System.out.println("There are " + car.getPassengerCount() + " passengers in the car.");

        car.setPassengerCount(-5);
        System.out.println("There are " + car.getPassengerCount() + " passengers in the car.");

    }
}
