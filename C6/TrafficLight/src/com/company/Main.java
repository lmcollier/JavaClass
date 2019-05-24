package com.company;

public class Main
{

    public static void main(String[] args)
    {
        TrafficLightColor westStreet = TrafficLightColor.GREEN;
        TrafficLightColor northStreet =  TrafficLightColor.RED;
        TrafficLightColor eastStreet = TrafficLightColor.YELLOW;
        TrafficLightColor southStreet = TrafficLightColor.GREEN;

        cityTraffic(westStreet);
        cityTraffic(northStreet);
        cityTraffic(eastStreet);
        cityTraffic(southStreet);

        getNextColor(TrafficLightColor.GREEN);
        getNextColor(TrafficLightColor.RED);
        getNextColor(TrafficLightColor.YELLOW);

        getNextColorLouis(TrafficLightColor.GREEN);
        getNextColorLouis(TrafficLightColor.RED);
        getNextColorLouis(TrafficLightColor.YELLOW);

    }

    private static void cityTraffic(TrafficLightColor cityStreet)
    {

        switch (cityStreet)
        {
            case RED:
                System.out.println("Stop");
                break;

            case YELLOW:
                System.out.println("Caution");
                break;

            case GREEN:
                System.out.println("Go");
                break;

            default:
                System.out.println("Out of Order");
        }
    }

    private static void getNextColor (TrafficLightColor firstColor)
    {

        if (firstColor == TrafficLightColor.GREEN)
        {
            System.out.println("The light will turn yellow.");
        }
        else if (firstColor == TrafficLightColor.YELLOW)
        {
            System.out.println("The light will turn red.");
        }
        else if (firstColor == TrafficLightColor.RED)
        {
            System.out.println("The light will turn green.");
        }
        else
        {
            System.out.println("The light is currently out of order!");
        }
    }

    private static void getNextColorLouis (TrafficLightColor trafficLightColor)
    {
        TrafficLightColor nextColor;

        switch (trafficLightColor)
        {
            case RED:
                nextColor = TrafficLightColor.GREEN;
                System.out.println(nextColor);
                break;
            case YELLOW:
                nextColor = TrafficLightColor.RED;
                System.out.println(nextColor);
                break;

            case GREEN:
                nextColor = TrafficLightColor.YELLOW;
                System.out.println(nextColor);
                break;

            default:
                System.out.println("Out of Order");
        }
    }
}
