package com.company;

public class Main
{

    public static void main(String[] args)
    {
        char redLight = response('R');
        System.out.println(redLight);

        char yellowLight = response('Y');
        System.out.println(yellowLight);

        char greenLight = response('G');
        System.out.println(greenLight);

        char malfunction = response('E');
        System.out.println(malfunction);

        char nxtColor = nextColor('R');
        System.out.println(nxtColor);

        nxtColor = nextColor('G');
        System.out.println(nxtColor);

        nxtColor = nextColor('Y');
        System.out.println(nxtColor);

        nxtColor = nextColor('K');
        System.out.println(nxtColor);

    }

    private static char response(char color)
    {
        char stop = 'S';
        char caution = 'C';
        char go = 'G';
        char error = 'E';

        if (color == 'R')
        {
            return stop;
        }
        else if (color == 'Y')
        {
            return caution;
        }
        else if (color == 'G')
        {
            return go;
        }
        else if (color == 'E')
        {
            return error;
        }
        else;

        return error;

    }

    private static char nextColor(char color)
    {
        if (color == 'R')
        {
            return 'G';
        }
        else if (color == 'G')
        {
            return 'Y';
        }
        else if (color == 'Y')
        {
            return 'R';
        }
        else;

        return 'E';
    }
}
