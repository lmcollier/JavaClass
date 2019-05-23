package com.company;

public class Main
{

    public static void main(String[] args)
    {
        calculateOrder();
    }

    private static int calculateOrder ()
    {
        int cost;
        int shipping;
        int totalCost;
        int length;

        //handling per order = $5


        do
        {
            System.out.println("-------------------------------------------");
            System.out.println("    Crazy Ed's Wholesale String Cheese     ");
            System.out.println("-------------------------------------------");

            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.println("Please enter a name for the order.");
            String name = input.next();

            System.out.println("Thank you, " + name + ". Please enter the type of cheese you want to order.");

            int cheese = input.nextInt();

            switch (cheese)
            {
                case 1:
                    System.out.println("Please enter the length needed in yards: ");
                    length = input.nextInt();
                    cost = 2 * length;

                    if (length < 50)
                    {
                        shipping = 2 * length;
                        totalCost = cost + shipping + 5;
                    }
                    else
                    {
                        totalCost = cost + 5;
                    }
                    System.out.println("The total cost of your order is $" + totalCost);
                    break;

                case 2:
                    System.out.println("Please enter the length needed in yards: ");
                    length = input.nextInt();
                    cost = 4 * length;

                    if (length < 75)
                    {
                        shipping = 2 * length;
                        totalCost = cost + shipping + 5;
                    }
                    else
                    {
                        totalCost = cost + 5;
                    }
                    System.out.println("The total cost of your order is $" + totalCost);
                break;

                case 3:
                    System.out.println("Please enter the length needed in yards: ");
                    length = input.nextInt();
                    cost = 6 * length;

                    if (length < 25)
                    {
                        shipping = 4 * length;
                        totalCost = cost + shipping + 5;
                    }
                    else
                    {
                        totalCost = cost + 5;
                    }
                    System.out.println("The total cost of your order is $" + totalCost);
                break;

                default:
                    System.out.println("That order is too crazy!");
            }
        }
        while (true);

    }
}
