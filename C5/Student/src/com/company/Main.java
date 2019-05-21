package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printStudentStatus(true);
        printStudentStatus(false);
    }

    private static void printStudentStatus(boolean isStudent)
    {
        System.out.println("I am a student: " + isStudent);
    }
}
