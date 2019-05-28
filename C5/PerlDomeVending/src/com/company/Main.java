package com.company;

public class Main
{

    public static void main(String[] args)
    {
        printMenu();
        displayMenuBronze();
    }

    private static void printMenu()
    {
        System.out.println("(W) Wasteland Wombat Womps");
        System.out.println("(H) Hero not Needed Wafers");
        System.out.println("(G) Gas Running Out Energy Bar");
        System.out.println("(P) Pig Parts Paradise");
        System.out.println("(E) Exit Menu");
    }

    private static void displayMenuBronze()
    {
        int selection = 0;

        boolean keepRunning = true;

        while (keepRunning)
        {
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.println("Please make a selection: ");
            char choice = input.next().charAt(0);

            switch (choice)
            {
                case 'W':
                case 'w':
                    System.out.println("Here is your selection of Wasteland Wombat Womps!");
                    break;

                case 'H':
                case 'h':
                    System.out.println("Here is your selection of Hero not Needed Wafers!");
                    break;

                case 'G':
                case 'g':
                    System.out.println("Here is your selection of Gas Running Out Energy Bar!");
                    break;

                case 'P':
                case 'p':
                    System.out.println("Here is your selection of Pig Parts Paradise!");
                    break;

                case 'E':
                case 'e':
                    System.out.println("Thank you for your patronage. Enjoy your selection.");
                    break;

                default:
                    selection++;

                    if (selection == 1)
                    {
                        System.out.println("Invalid selection. Try that again and it's off to the Perl Dome with you!");
                    }
                    else if (selection == 2)
                    {
                        System.out.println("You were warned! Off to the Perl Dome with you!");
                        selection = 0;
                    }
            }
        }
    }

    /*private static void displayMenuSilver()
    {
        int selection = 0;


        if (selection <= 10)
        {
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.println("Please make a selection: ");
            char choice = input.next().charAt(0);
            selection++;

            switch (choice)
            {
                case 'W':
                case 'w':
                    selection++;

                    if (selection <= 1)
                    {
                        System.out.println("Here is your selection of Wasteland Wombat Womps!");
                    }
                    else if (selection > 3)
                    {
                        System.out.println("We are sorry, that item is not available right now. Please try again " +
                                "later");
                    }
                    break;

                case 'H':
                case 'h':
                    selection++;

                    if (selection <= 1)
                    {
                        System.out.println("Here is your selection of Hero not Needed Wafers!");
                    }
                    else if (selection > 3)
                    {
                        System.out.println("We are sorry, that item is not available right now. Please try again " +
                                "later");
                    }
                    break;

                case 'G':
                case 'g':
                    selection++;

                    if (selection <= 1)
                    {
                        System.out.println("Here is your selection of Gas Running Out Energy Bar!");
                    }
                    else if (selection > 3)
                    {
                        System.out.println("We are sorry, that item is not available right now. Please try again " +
                                "later");
                    }
                    break;

                case 'P':
                case 'p':
                    selection++;

                    if (selection <= 1)
                    {
                        System.out.println("Here is your selection of Pig Parts Paradise!");
                    }
                    else if (selection > 3)
                    {
                        System.out.println("We are sorry, that item is not available right now. Please try again " +
                                "later");
                    }
                    break;

                case 'E':
                case 'e':
                    System.out.println("Thank you for your patronage. Enjoy your selection.");
                    break;

                    default:
                    selection++;

                    if (selection == 1)
                    {
                        System.out.println("Invalid selection. Try that again and it's off to the Perl Dome with you!");
                    }
                    else if (selection == 2)
                    {
                        System.out.println("You were warned! Off to the Perl Dome with you!");
                        selection = 0;
                    }
            }
        }
        else
        {
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.println("You have to enter the secret password: ");
        }
    }*/
}
