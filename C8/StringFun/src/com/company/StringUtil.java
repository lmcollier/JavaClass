package com.company;

import java.sql.SQLOutput;

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

    public static void printPhoneNumber(String phoneNumber)
    {
        int startAreaCodeIndex = 0;
        int startExchangeIndex = 4;
        int startLineNumberIndex = 8;

        String decodedPhoneNumber = decodedPhoneNumber(phoneNumber);

        if (phoneNumber.length() == 10)
        {
            startAreaCodeIndex = 0;
            startExchangeIndex = 3;
            startLineNumberIndex = 6;
        }

        String firstThreeNum = phoneNumber.substring(startAreaCodeIndex, startAreaCodeIndex + 3);
        String nextThree = phoneNumber.substring(startExchangeIndex, startExchangeIndex + 3);
        String lastFour = phoneNumber.substring(startLineNumberIndex);

        System.out.println("Area Code: " + firstThreeNum);
        System.out.println("Exchange: " + nextThree);
        System.out.println("Line Number: " + lastFour);
        System.out.println("Decoded: " + decodedPhoneNumber);

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

    private static String decodedPhoneNumber(String phoneNumber)
    {
        String decodedPhoneNumber = phoneNumber.replace('A', '2');
        decodedPhoneNumber = decodedPhoneNumber.replace('B', '2');
        decodedPhoneNumber = decodedPhoneNumber.replace('C', '2');
        decodedPhoneNumber = decodedPhoneNumber.replace('D', '3');
        decodedPhoneNumber = decodedPhoneNumber.replace('E', '3');
        decodedPhoneNumber = decodedPhoneNumber.replace('F', '3');
        decodedPhoneNumber = decodedPhoneNumber.replace('G', '4');
        decodedPhoneNumber = decodedPhoneNumber.replace('H', '4');
        decodedPhoneNumber = decodedPhoneNumber.replace('I', '4');
        decodedPhoneNumber = decodedPhoneNumber.replace('J', '5');
        decodedPhoneNumber = decodedPhoneNumber.replace('K', '5');
        decodedPhoneNumber = decodedPhoneNumber.replace('L', '5');
        decodedPhoneNumber = decodedPhoneNumber.replace('M', '6');
        decodedPhoneNumber = decodedPhoneNumber.replace('N', '6');
        decodedPhoneNumber = decodedPhoneNumber.replace('O', '4');
        decodedPhoneNumber = decodedPhoneNumber.replace('P', '7');
        decodedPhoneNumber = decodedPhoneNumber.replace('Q', '7');
        decodedPhoneNumber = decodedPhoneNumber.replace('R', '7');
        decodedPhoneNumber = decodedPhoneNumber.replace('S', '7');
        decodedPhoneNumber = decodedPhoneNumber.replace('T', '8');
        decodedPhoneNumber = decodedPhoneNumber.replace('U', '8');
        decodedPhoneNumber = decodedPhoneNumber.replace('V', '8');
        decodedPhoneNumber = decodedPhoneNumber.replace('W', '9');
        decodedPhoneNumber = decodedPhoneNumber.replace('X', '9');
        decodedPhoneNumber = decodedPhoneNumber.replace('Y', '9');
        decodedPhoneNumber = decodedPhoneNumber.replace('Z', '9');


        return decodedPhoneNumber;
    }

}
