package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String fancyName = getMyFancyName(" ### ");
        System.out.println(fancyName);

        String fancyName2 = getMyFancyName(" $$$ ");
        System.out.println(fancyName2);

        String fancyName3 = getMyFancyName(" *!* ");
        System.out.println(fancyName3);
    }

    private static String getMyFancyName(String decoration)
    {
        return decoration + "Larissa" + decoration;
    }
}
