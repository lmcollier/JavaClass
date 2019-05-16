package com.company;

//give you starting point, figure out where it is going to end
//compute the math

import java.sql.SQLOutput;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please pick a type of ship: 1=carrier, 2=battleship, 3=cruiser, 4=submarine, 5=destroyer.");
        int ship = userInput.nextInt();

        System.out.println("Please enter a letter A-J:");
        char rowLetter = userInput.next().charAt(0);

        System.out.println("Please enter a number 1-10:");
        int rowNumber = userInput.nextInt();

        System.out.println("Please enter directional letter: N=North, E=East, S=South, W=West");
        char direction = userInput.next().charAt(0);

        boolean startPoint = false;

        if (('A' <= rowLetter) && (rowLetter <= 'J')) //validates the letters
        {
            if ((1 <= rowNumber) && (rowNumber <= 10)) //validates the rows
            {
                if (direction == 'N')
                {
                    if (ship == 1)
                    {
                        startPoint = ('E' <= rowLetter) && (rowLetter <= 'J');
                        System.out.println("Got here");
                        // If carrier and facing north, start point has to be between E and J
                    }
                    else if (ship == 2)
                    {
                        startPoint = (('D' <= rowLetter) && (rowLetter <= 'J'));
                    }
                    else if (ship == 3)
                    {
                        startPoint = (('C' <= rowLetter) && (rowLetter <= 'J'));
                    }
                    else if (ship == 4)
                    {
                        startPoint = (('C' <= rowLetter) && (rowLetter <= 'J'));
                    }
                    else if (ship == 5)
                    {
                        startPoint = (('B' <= rowLetter) && (rowLetter <= 'J'));
                    }
                }

                if (direction == 'S')
                {
                    if (ship == 1)
                    {
                        startPoint = (('A' <= rowLetter) && (rowLetter <= 'F'));
                    }
                    else if (ship == 2)
                    {
                        startPoint = (('A' <= rowLetter) && (rowLetter <= 'G'));
                    }
                    else if (ship == 3)
                    {
                        startPoint = (('A' <= rowLetter) && (rowLetter <= 'H'));
                    }
                    else if (ship == 4)
                    {
                        startPoint = (('A' <= rowLetter) && (rowLetter <= 'H'));
                    }
                    else if (ship == 5)
                    {
                        startPoint = (('A' <= rowLetter) && (rowLetter <= 'I'));
                    }
                }

                if (direction == 'W')
                {
                    if (ship == 1)
                    {
                        startPoint = ((5 <= rowNumber) && (rowNumber <= 10));
                    }
                    else if (ship == 2)
                    {
                        startPoint = ((4 <= rowNumber) && (rowNumber <= 10));
                    }
                    else if (ship == 3)
                    {
                        startPoint = ((3 <= rowNumber) && (rowNumber <= 10));
                    }
                    else if (ship == 4)
                    {
                        startPoint = ((3 <= rowNumber) && (rowNumber <= 10));
                    }
                    else if (ship == 5)
                    {
                        startPoint = ((2 <= rowNumber) && (rowNumber <= 10));
                    }
                }

                if (direction == 'E')
                {
                    if (ship == 1)
                    {
                        startPoint = ((1 <= rowNumber) && (rowNumber <= 5));
                    }
                    else if (ship == 2)
                    {
                        startPoint = ((1 <= rowNumber) && (rowNumber <= 6));
                    }
                    else if (ship == 3)
                    {
                        startPoint = ((1 <= rowNumber) && (rowNumber <= 7));
                    }
                    else if (ship == 4)
                    {
                        startPoint = ((1 <= rowNumber) && (rowNumber <= 7));
                    }
                    else if (ship == 5)
                    {
                        startPoint = ((1 <= rowLetter) && (rowNumber <= 8));
                    }
                }
            }
        }
        if (startPoint == true)
        {
            System.out.println("This is a valid play!");
        }
        else
        {
            System.out.println("This is an invalid play!");
        }
    }
}