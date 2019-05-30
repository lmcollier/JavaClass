package com.company;

public class StringUtil
{
    String randomString;

    public void setRandomString(String randomString)
    {
        this.randomString = randomString;
    }

    public static char getFirstCharacter(String randomString)
    {
        char firstChar = randomString.charAt(0);
        return firstChar;
    }

    public static char getLastCharacter(String randomString)
    {
        char lastChar = randomString.charAt((randomString.length() - 1));
        return lastChar;
    }

    public static String getFirstTwoCharacters(String randomString)
    {
        String firstTwo = randomString.substring(0, 2);
        return firstTwo;
    }

    public static String getLastTwoCharacters(String randomString)
    {
        String lastTwo = randomString.substring((randomString.length() - 2), (randomString.length() - 0));
        return lastTwo;
    }

    public static String getFirstThreeCharacters(String randomString)
    {
        String firstThree = randomString.substring(0, 3);
        return firstThree;
    }

    public static String getLastThreeCharacters(String randomString)
    {
        String lastThree = randomString.substring((randomString.length() - 3), (randomString.length() - 0));
        return lastThree;
    }

    public static void getEveryOtherCharacter(String randomString)
    {
        for (int everyOther = 0; everyOther < randomString.length(); everyOther += 2)
        {
            System.out.print(randomString.charAt(everyOther));
        }
    }

    public static void printCharacters(String randomString)
    {
        int number = 0;

        for (int printLetters = 0; printLetters < randomString.length(); printLetters++)
        {
            System.out.println(randomString.charAt(printLetters) + " : " + number++);
        }
    }

    public static void printPhoneNumber(String randomString)
    {
        String firstThreeNum = randomString.substring(0, 3);
        System.out.println("Area Code: " + firstThreeNum);

        String nextThree = randomString.substring(4, 7);
        System.out.println("Exchange: " + nextThree);

        String lastFour = randomString.substring(8, 12);
        System.out.println("Line Number: " + lastFour);
    }

    public static void findFirstE(String randomString)
    {
        int firstE = randomString.indexOf('e');
        System.out.println(firstE);
    }

    public static void isFinn(String randomString)
    {
        boolean finn = false;

        if (randomString.matches("Finn"))
        {
            finn = true;
            System.out.println(finn);
        }
        else
        {
            System.out.println(finn);
        }

    }
}
