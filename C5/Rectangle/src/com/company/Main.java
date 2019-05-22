package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int area = getArea(4, 5);
        System.out.println(area);

        int perimeter = getPerimeter(4, 5);
        System.out.println(perimeter);
    }

    private static int getArea (int height, int width)
    {
        return height * width;
    }

    private static int getPerimeter (int height, int width)
    {
        return (height * 2) + (width * 2);
    }

}
