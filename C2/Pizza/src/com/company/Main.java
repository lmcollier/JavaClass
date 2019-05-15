package com.company;

//company requires slice of pizza to be at least 13 sq inches
//create variable for diameter
//based on value of diameter, calculate number of pieces of pizza that can be sliced
//10 inch pizza should have 6 slices
//12 should gave 8
//Sample output - A 10 inch pizza will yield 6.0 slices

public class Main
{
    public static void main(String[] args)
    {
        double slice = 13.0;
        double radius10 = 5.0;
        double radius12 = 6.0;

        double area10 = Math.PI * (radius10*radius10);
        double area12 = Math.PI * (radius12*radius12);

        double pizza10 = area10/slice;
        double pizza12 = area12/slice;

        int sliceIn10 = (int) pizza10;
        int sliceIn12 = (int) pizza12;

        System.out.println("A 10 inch pizza will yield " + sliceIn10 + " slices.");
        System.out.println("A 12 inch pizza will yield " + sliceIn12 + " slices.");
    }
}
