package com.company;

public class Main
{

    public static void main(String[] args)
    {
        StringUtil stringText = new StringUtil();
        stringText.setRandomString("Hello");

        System.out.println(StringUtil.getFirstCharacter("Hello"));
        System.out.println(StringUtil.getLastCharacter("Hello"));
        System.out.println(StringUtil.getFirstCharacter("Goodbye"));
        System.out.println(StringUtil.getLastCharacter("Goodbye"));
        System.out.println("-----------");
        System.out.println(StringUtil.getFirstTwoCharacters("Hello"));
        System.out.println(StringUtil.getLastTwoCharacters("Hello"));
        System.out.println("-----------");
        System.out.println(StringUtil.getFirstThreeCharacters("Hello"));
        System.out.println(StringUtil.getFirstThreeCharacters("Goodbye"));
        System.out.println("-----------");
        System.out.println(StringUtil.getLastThreeCharacters("Hello"));
        System.out.println(StringUtil.getLastThreeCharacters("Goodbye"));
        System.out.println("-----------");
        StringUtil.getEveryOtherCharacter("SEEKCARWEST");
        System.out.println("\n");
        System.out.println("-----------");
        StringUtil.printCharacters("Hello");
        System.out.println("-----------");
        StringUtil.printPhoneNumber("501-555-0100");
        System.out.println("-----------");
        StringUtil.printPhoneNumber("501463WELL");
        System.out.println("-----------");
        StringUtil.findFirstE("Hello");
        StringUtil.findFirstE("Goodbye");
        System.out.println("-----------");
        StringUtil.isFinn("Jake");
        StringUtil.isFinn("Finn");

    }

}
