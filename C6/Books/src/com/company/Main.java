package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Bookshelf bookshelf = new Bookshelf(125);
        System.out.println("There are " + bookshelf.bookCount + " books on the shelf!");

        bookshelf = new Bookshelf(50);
        System.out.println("There are " + bookshelf.bookCount + " books on the shelf!");

    }
}
