package com.task4.test;

/**
 * Created by Vitalii on 08.04.2017.
 */
enum Demo33
{
    DEMO;

    int i = 10;

    {
        i--;
    }

    {
        --i;
    }

    private Demo33()
    {
        i = i-- + --i;
    }
}

public class TestClass
{
    public static void main(String[] args)
    {
        System.out.println(Demo33.DEMO.i);
    }
}
