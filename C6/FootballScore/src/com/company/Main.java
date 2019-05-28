package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Score score = new Score();
        System.out.println("The current score is: " + score.getPoints());
        score.completedFieldGoal();
        score.completedTouchdown();

        score.setPoints(10);

        System.out.println("The current score is: " + score.getPoints());
        score.completedFieldGoal();
        score.completedTouchdown();


    }
}
