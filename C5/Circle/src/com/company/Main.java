package com.company;

public class Main
{

    public static void main(String[] args)
    {
        double area = getArea(4);
        System.out.println("The area of a circle is: " + area);

        double diameter = getDiameter(12);
        System.out.println("The diameter of a circle is: " + diameter);

        double circumference = getCircumference(6);
        System.out.println("The circumference of a circle is: " + circumference);

    }

    private static double getArea (double radius)
    {
        return 3.14 * (radius * radius);
    }

    private static double getDiameter (double radius)
    {
        return radius * 2;
    }

    private static double getCircumference (double diameter)
    {
        return diameter * 3.14;
    }
}
