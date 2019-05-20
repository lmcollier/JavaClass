package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please pick a number: ");
        final int number1 = userInput.nextInt();

        System.out.println("Please pick another number: ");
        final int number2 = userInput.nextInt();

        if (number1 != number2)
        {
            int startNumber;
            int endNumber;

            if (number1 < number2)
            {
                startNumber = number1;
                endNumber = number2;
            }
            else
            {
                startNumber = number2;
                endNumber = number1;
            }
            System.out.println("Counting ...");

            startNumber++;

            while (startNumber < endNumber)
            {
                System.out.println(startNumber);
                startNumber++;
            }
        }



        /*boolean para1 = startNumber > endNumber;
        boolean para2 = startNumber < endNumber;

        boolean countDown = startNumber > startNumber-- && startNumber-- > endNumber;
        boolean countUp = startNumber < startNumber++ && startNumber++ < endNumber;

        if (para1)
        {
            while (countDown)
            {
                startNumber--;
                System.out.println();
            }
        }

        else if (para2)
        {
            while (countUp)
            {
                startNumber++;
                System.out.println();
            }
        }

        else if (startNumber == endNumber)
        {
            System.out.println();
        }*/
    }
}
