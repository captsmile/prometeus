package com.task4.test;

/**
 * Created by Vitalii on 08.04.2017.
 */
enum Seasons1
{
    SPRING, WINTER;

    private Seasons1()
    {
        System.out.println("ok");
    }
}

public class Test2
{
    public static void main(String[] args)
    {
        Seasons1[] seasons= new Seasons1[2];

        for (int i = 0; i  < seasons.length; i++)
        {
            System.out.print(seasons[i]);
        }
    }
}
