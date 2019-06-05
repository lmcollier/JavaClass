package com.company;

public class MathStep
{
    private CalculatorAction calculatorAction;
    private long answer;

    public MathStep(CalculatorAction calculatorAction, long answer)
    {
        this.calculatorAction = calculatorAction;
        this.answer = answer;
    }

    public CalculatorAction getCalculatorAction()
    {
        return calculatorAction;
    }

    public void setCalculatorAction(CalculatorAction calculatorAction)
    {
        this.calculatorAction = calculatorAction;
    }

    public long getAnswer()
    {
        return answer;
    }

    public void setAnswer(long answer)
    {
        this.answer = answer;
    }
}

