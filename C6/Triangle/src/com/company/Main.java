package com.company;

public class Main
{

    public static void main(String[] args)
    {

        printTriangleSummary(4,4, 4);
        printTriangleSummary(4, 5, 8);
        printTriangleSummary(10, 10, 12);
        printTriangleSummary(3, 4, 5);

    }

    private static void printTriangleSummary(int sideA, int sideB, int sideC)
    {
        Triangle triangle = new Triangle();
        triangle.setSideA(sideA);
        triangle.setSideB(sideB);
        triangle.setSideC(sideC);

        System.out.println("Side A = " + sideA);
        System.out.println("Side B = " + sideB);
        System.out.println("Side C = " + sideC);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.isEquilateral());
        System.out.println(triangle.isIsosceles());
        System.out.println(triangle.isScalene());
        System.out.println(triangle.isValid());
        System.out.println(triangle.isRightAngle());
        System.out.println(triangle.isAcuteAngle());
        System.out.println(triangle.isObtuseAngle());

    }
}
