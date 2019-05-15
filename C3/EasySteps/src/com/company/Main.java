package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //Recognizing Data Types

        char letter = 'M';
        String title = "Java in easy steps";
        int number = 365;
        float decimal = 98.6f;
        boolean result = true;

        System.out.println("Initial is " + letter);
        System.out.println("Book is " + title);
        System.out.println("Days are " + number);
        System.out.println("Temperature is " + decimal);
        System.out.println("Answer is " + result);

        //Comparing Values

        String txt = "Fantastic";
        String lang = "Java";
        boolean state = (txt==lang);
        System.out.println("String Equality Test: " + state);

        state = (txt != lang);
        System.out.println("String Inequality Test: " + state);

        int dozen = 12;
        int score = 20;
        state = (dozen >score);
        System.out.println("Greater Than Test: " + state);

        state = (dozen < score);
        System.out.println("Less Than Test: " + state);

        //Assessing Logic

        boolean yes = true;
        boolean no = false;

        System.out.println("Both YesYes True: " + (yes&&yes));
        System.out.println("Both YesNo True: " + (yes&&no));

        System.out.println("Either YesYes True: " + (yes||yes));
        System.out.println("Either YesNo True: " + (yes||no));
        System.out.println("Either NoNo True: " + (no||no));

        System.out.println("Original Yes Value: " + yes);
        System.out.println("Inverse Yes Value: " + !yes);

    }
}
