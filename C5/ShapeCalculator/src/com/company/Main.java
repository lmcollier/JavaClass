package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Please pick C for circle, S for square, or R for rectangle.");
        char shape = input.next().charAt(0);

        double area;
        double perimeter;

        switch (shape)
        {
            case 'C':
            case 'c':
                System.out.println("Please enter the radius: ");
                int radius = input.nextInt();
                area = 3.14 * (radius * radius);
                perimeter = 2 * 3.14 * radius;
                System.out.println("The area is " + area + " and the circumference is " + perimeter + ".");
                break;

            case 'S':
            case 's':
                System.out.println("Please enter the length of a side: ");
                int side = input.nextInt();
                area = side * side;
                perimeter = side * 4;
                System.out.println("The area is " + area + " and the perimeter is " + perimeter + ".");
                break;

            case 'R':
            case 'r':
                System.out.println("Please enter the length of the short side: ");
                int sideShort = input.nextInt();
                System.out.println("Please enter the length of the long side: ");
                int sideLong = input.nextInt();
                area = sideLong * sideShort;
                perimeter = (sideShort * 2) + (sideLong * 2);
                System.out.println("The area is " + area + " and the perimeter is " + perimeter + ".");
                break;

            default:
                System.out.println("That was an invalid selection.");
        }
    }
}
