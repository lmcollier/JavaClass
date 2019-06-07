package com.company;

import java.util.HashMap;

public class SimpleMap
{
    public static void demo()
    {
        HashMap<String, String> countries = new HashMap<>();
        countries.put("USA", "United States");
        countries.put("MEX", "Mexico");
        countries.put("CAN", "Canada");

        String usa = countries.get("USA");
        String canada = countries.get("CAN");
        System.out.println("Country: " + usa);
        System.out.println("Country: " + canada);

        String removed = countries.remove("USA");
        System.out.println("Removed: " + removed);

        System.out.println(countries);
    }
}
