package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Planet mercury = new Planet("Mercury");
        Planet venus = new Planet("Venus");
        Planet earth = new Planet("Earth");
        Planet mars = new Planet("Mars");
        Planet jupiter = new Planet("Jupiter");
        Planet saturn = new Planet("Saturn");
        Planet uranus = new Planet("Uranus");
        Planet neptune = new Planet("Neptune");
        Planet pluto = new Planet("Pluto");


        Planet[] planets = new Planet[9];
        planets[0] = mercury;
        planets[1] = venus;
        planets[2] = earth;
        planets[3] = mars;
        planets[4] = jupiter;
        planets[5] = saturn;
        planets[6] = uranus;
        planets[7] = neptune;
        planets[8] = pluto;

        for (Planet planet : planets)
        {
            System.out.println(planet.getPlanetName());
        }

    }
}
