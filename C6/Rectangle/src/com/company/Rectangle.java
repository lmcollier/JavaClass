package com.company;

public class Rectangle
{
    private int height;
    private int width;

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int doubleHeight()
    {
        height *= 2;
        return height;
    }
    public int doubleWidth()
    {
        width *= 2;
        return width;
    }

    public void rotate()
    {
        int rotate = height;
        height = width;
        width = rotate;
    }



}
