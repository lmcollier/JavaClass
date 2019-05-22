package com.company;

public class Main
{

    public static void main(String[] args)
    {
        double volume1 = getCargoVolume(10.5, 12.5, 15.5);
        System.out.println(volume1);

        double volume2 = getCargoVolumeB(21, 28, 30, true);
        System.out.println(volume2);

        volume2 = getCargoVolumeB(21, 28, 30, false);
        System.out.println(volume2);
    }

    private static double getCargoVolume (double height, double length, double depth)
    {
        double thickness = 0.25;
        double heightInt = height - (2*thickness);
        double lengthInt = length - (2*thickness);
        double depthInt = depth - (2*thickness);

        return heightInt * lengthInt * depthInt;
    }

    private static double getCargoVolumeB (double height, double length, double depth, boolean heavyDuty)
    {
        double thickness = 0.25;
        double heightInt = height - (2*thickness);
        double lengthInt = length - (2*thickness);
        double depthInt = depth - (2*thickness);

        double volume = heightInt * lengthInt * depthInt;

        if (heavyDuty)
        {
            thickness = (2*0.25);
            heightInt = height - (2*thickness);
            lengthInt = length - (2*thickness);
            depthInt = depth - (2*thickness);

            System.out.println(thickness);

            return heightInt * lengthInt * depthInt;
        }

        System.out.println(thickness);
        return volume;
    }
}
