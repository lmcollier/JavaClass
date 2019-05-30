package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String firstString = "java";
        String secondString = "java";
        String thirdString = new String("java");

        if (firstString == secondString)
        {
            System.out.println("firstString == secondString");
        }
        if (firstString == thirdString)
        {
            System.out.println("firstString == thirdString");
            //only comparing instance and not the object, so not equal
        }
        if (firstString.equals(secondString))
        {
            System.out.println("firstString equals secondString");
        }
        if (firstString.equals(thirdString))
        {
            System.out.println("firstString equals thirdString");
            //actually comparing the object rather than the instance
        }

        System.out.println("----------------------------------------");
        String text = "Something";
        String upper = text.toUpperCase();
        String sub = text.substring(4);
        //computer starts counting at zero so S = 0, O = 1, M = 2, E = 3 and string starts "thing"
        String sub2 = text.substring(4, 6);
        //in this, first number is inclusive, second number is exclusive

        System.out.println(text);
        System.out.println(upper);
        System.out.println(sub);
        System.out.println(sub2);
    }
}
