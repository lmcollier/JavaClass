package com.company;

public class Score
{
    private int points;

    public int getPoints()
    {
        return points;
    }

    public void setPoints(int points)
    {
        this.points = points;
    }

    public void completedFieldGoal()
    {
        int fieldGoal = this.points + 3;
        System.out.println("Field Goal! The current score is: " + fieldGoal);
    }

    public void completedTouchdown()
    {
        int touchdown = this.points + 7;
        System.out.println("Touchdown! The current score is: " + touchdown);
    }
}