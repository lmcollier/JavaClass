package com.company;

public class PetNames
{
    private String petNames;

    public void setPetNames(String petNames)
    {
        this.petNames = petNames;
    }

    public String getPetNames()
    {
        return petNames;
    }

    public static void receivePetName()
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);
        System.out.println("Please enter in the number of pets: ");
        int petNumber = userInput.nextInt();
        int total;

        String[] allNames = new String[petNumber];

        for (total = 0; total < petNumber; total++)
        {
            System.out.println("Please provide the name for one of your pets: ");
            allNames[total] = userInput.next();
        }

        for (int i = 0; i < allNames.length; i++)
        {
            System.out.println(allNames[i]);
        }
    }
}
