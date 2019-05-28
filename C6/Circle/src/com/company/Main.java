package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Circle circle = new Circle();
        circle.setRadius(3.0);

        double diameter = circle.getDiameter();
        System.out.println(diameter);

        double area = circle.getArea();
        System.out.println(area);

        circle.setRadius(4);
        diameter = circle.getDiameter();
        area = circle.getArea();
        System.out.println(diameter);
        System.out.println(area);
    }
}
