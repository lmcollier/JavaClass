package com.company;

public class Main
{

    public static void main(String[] args)
    {
        House house = new House(5);
        System.out.println("There are " + house.getRoomCount() + " rooms in the house.");

        house = new House(10);
        System.out.println("There are " + house.getRoomCount() + " rooms in the house.");



    }
}
