package com.company;

import java.text.DecimalFormat;

public class Main
{

    public static void main(String[] args)
    {
        //Bronze Level

        int withdrawal = 137;

        int optimal5 = withdrawal/5;
        int optimal1 = withdrawal%5;

        System.out.println("For the amount of $" + withdrawal + ", the optimal number of $5s is " +
                optimal5 + " and the optimal number of $1s is " + optimal1 + ".");

        withdrawal = 100;
        optimal5 = withdrawal/5;
        optimal1 = withdrawal%5;
        System.out.println("For the amount of $" + withdrawal + ", the optimal number of $5s is " +
                optimal5 + " and the optimal number of $1s is " + optimal1 + ".");

        withdrawal = 20;
        optimal5 = withdrawal/5;
        optimal1 = withdrawal%5;
        System.out.println("For the amount of $" + withdrawal + ", the optimal number of $5s is " +
                optimal5 + " and the optimal number of $1s is " + optimal1 + ".");

        withdrawal = 17;
        optimal5 = withdrawal/5;
        optimal1 = withdrawal%5;
        System.out.println("For the amount of $" + withdrawal + ", the optimal number of $5s is " +
                optimal5 + " and the optimal number of $1s is " + optimal1 + ".");

        withdrawal = 15;
        optimal5 = withdrawal/5;
        optimal1 = withdrawal%5;
        System.out.println("For the amount of $" + withdrawal + ", the optimal number of $5s is " +
                optimal5 + " and the optimal number of $1s is " + optimal1 + ".");

        withdrawal = 2;
        optimal5 = withdrawal/5;
        optimal1 = withdrawal%5;
        System.out.println("For the amount of $" + withdrawal + ", the optimal number of $5s is " +
                optimal5 + " and the optimal number of $1s is " + optimal1 + ".");

        //Silver Level

        withdrawal = 137;

        int optimal20 = withdrawal/20;
        int noTwenty = optimal20 * 20;
        int optimal10 = (withdrawal - noTwenty)/10;
        int noTen = optimal10 * 10;
        int optimal5s = (withdrawal - (noTwenty + noTen))/5;
        int noFive = optimal5s * 5;
        int optimal1s = withdrawal - (noFive + noTen + noTwenty);

        System.out.println("For the amount of $" + withdrawal + ", the optimal number of $20s is " + optimal20 +
                        ", $10 = " + optimal10 + ", $5s = " + optimal5s + ", and $1s = " + optimal1s + ".");

        withdrawal = 100;

        optimal20 = withdrawal/20;
        noTwenty = optimal20 * 20;
        optimal10 = (withdrawal - noTwenty)/10;
        noTen = optimal10 * 10;
        optimal5s = (withdrawal - (noTwenty + noTen))/5;
        noFive = optimal5s * 5;
        optimal1s = withdrawal - (noFive + noTen + noTwenty);

        System.out.println("For the amount of $" + withdrawal + ", the optimal number of $20s is " + optimal20 +
                ", $10 = " + optimal10 + ", $5s = " + optimal5s + ", and $1s = " + optimal1s + ".");

        withdrawal = 17;

        optimal20 = withdrawal/20;
        noTwenty = optimal20 * 20;
        optimal10 = (withdrawal - noTwenty)/10;
        noTen = optimal10 * 10;
        optimal5s = (withdrawal - (noTwenty + noTen))/5;
        noFive = optimal5s * 5;
        optimal1s = withdrawal - (noFive + noTen + noTwenty);

        System.out.println("For the amount of $" + withdrawal + ", the optimal number of $20s is " + optimal20 +
                ", $10 = " + optimal10 + ", $5s = " + optimal5s + ", and $1s = " + optimal1s + ".");

        withdrawal = 15;

        optimal20 = withdrawal/20;
        noTwenty = optimal20 * 20;
        optimal10 = (withdrawal - noTwenty)/10;
        noTen = optimal10 * 10;
        optimal5s = (withdrawal - (noTwenty + noTen))/5;
        noFive = optimal5s * 5;
        optimal1s = withdrawal - (noFive + noTen + noTwenty);

        System.out.println("For the amount of $" + withdrawal + ", the optimal number of $20s is " + optimal20 +
                ", $10 = " + optimal10 + ", $5s = " + optimal5s + ", and $1s = " + optimal1s + ".");

        withdrawal = 2;

        optimal20 = withdrawal/20;
        noTwenty = optimal20 * 20;
        optimal10 = (withdrawal - noTwenty)/10;
        noTen = optimal10 * 10;
        optimal5s = (withdrawal - (noTwenty + noTen))/5;
        noFive = optimal5s * 5;
        optimal1s = withdrawal - (noFive + noTen + noTwenty);

        System.out.println("For the amount of $" + withdrawal + ", the optimal number of $20s is " + optimal20 +
                ", $10 = " + optimal10 + ", $5s = " + optimal5s + ", and $1s = " + optimal1s + ".");

        //Gold Level

        withdrawal = 137;

        optimal20 = withdrawal/20;
        noTwenty = optimal20 * 20;
        optimal10 = (withdrawal - noTwenty)/10;
        noTen = optimal10 * 10;
        optimal5s = (withdrawal - (noTwenty + noTen))/5;
        noFive = optimal5s * 5;
        optimal1s = withdrawal - (noFive + noTen + noTwenty);

        DecimalFormat df = new DecimalFormat("0.00");

        double totalFee = 1 + (optimal20*.1) + (optimal10*.1) + (optimal5s*.1) + (optimal1s*.1);
        System.out.println("The total fee for the withdrawal of $" + withdrawal + " is $" + df.format(totalFee) + ".");


        withdrawal = 486;

        optimal20 = withdrawal/20;
        noTwenty = optimal20 * 20;
        optimal10 = (withdrawal - noTwenty)/10;
        noTen = optimal10 * 10;
        optimal5s = (withdrawal - (noTwenty + noTen))/5;
        noFive = optimal5s * 5;
        optimal1s = withdrawal - (noFive + noTen + noTwenty);

        totalFee = 1 + (optimal20*.1) + (optimal10*.1) + (optimal5s*.1) + (optimal1s*.1);
        System.out.println("The total fee for the withdrawal of $" + withdrawal + " is $" + df.format(totalFee) + ".");
    }
}
