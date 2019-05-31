package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] array1 = new int[10];
        array1[0] = 4;
        array1[3] = 2;
        array1[9] = 4;

        ArrayUtil.printArray(array1);

        String[] array2 = new String[10];
        array2[0] = "Hi";
        array2[3] = "Hello";
        array2[9] = "Bye";

        ArrayUtil.printArrayString(array2);


        /*int[] number = {1, 5, 9};

        int[] numbers = {5, 15, 9, 8};

        int[] number2 = {5, 8, 21, 28};

        int[] number3 = {-1, -3, -5, -10};*/


    }
}
