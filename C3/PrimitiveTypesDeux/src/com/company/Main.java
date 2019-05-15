package com.company;

public class Main
{

    public static void main(String[] args)
    {
        float flt = 1.0f / 3.0f;
        double dbl = 1.0 / 3.0;

        System.out.println(flt);
        System.out.println(dbl);

        dbl = 3.99999999;
        long lg = (long)dbl;

        System.out.println(lg);
    }
}
