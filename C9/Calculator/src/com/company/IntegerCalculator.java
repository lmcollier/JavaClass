package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerCalculator
{
    private long answer = 0;
    private ArrayList<MathStep> history = new ArrayList<>();

    public void run()
    {
        Scanner input = new Scanner(System.in);

        boolean keepRunning = true;

        do
        {
            String action = input.next().toUpperCase();

            switch (action)
            {
                case "ADD":
                case "A":
                {
                    long value = Long.parseLong(input.next());
                    add(value);
                    break;
                }
                case "SUBTRACT":
                case "S":
                {
                    long value = Long.parseLong(input.next());
                    subtract(value);
                    break;
                }
                case "MULTIPLY":
                case "M":
                {
                    long value = Long.parseLong(input.next());
                    multiply(value);
                    break;
                }
                case "DIVIDE":
                case "D":
                {
                    long value = Long.parseLong(input.next());
                    divide(value);
                    break;
                }
                case "CLEAR":
                case "C":
                {
                    clear();
                    break;
                }
                case "EXIT":
                case "E":
                {
                    keepRunning = false;
                    break;
                }
                case "HISTORY":
                case "H":
                {
                    printHistory();
                }
                default:
            }

            System.out.println("Answer: " + answer);
        }
        while (keepRunning);
    }

    private void add(long value)
    {
        answer += value;
        MathStep mathStep = new MathStep(CalculatorAction.ADD, value);
        history.add(mathStep);
    }

    private void subtract(long value)
    {
        answer -= value;
        MathStep mathStep = new MathStep(CalculatorAction.SUBTRACT, value);
        history.add(mathStep);
    }

    private void multiply(long value)
    {
        answer *= value;
        MathStep mathStep = new MathStep(CalculatorAction.MULTIPLY, value);
        history.add(mathStep);
    }

    private void divide(long value)
    {
        answer /= value;
        MathStep mathStep = new MathStep(CalculatorAction.DIVIDE, value);
        history.add(mathStep);
    }

    private void clear()
    {
        answer = 0;
        MathStep mathStep = new MathStep(CalculatorAction.CLEAR, answer);
        history.add(mathStep);
    }

    private void printHistory()
    {
        for (MathStep mathStep : history)
        {
            System.out.println(mathStep.getCalculatorAction() + " " + mathStep.getValue());
        }
    }
}
