package com.task4.test;

/**
 * Created by Vitalii on 08.04.2017.
 */
enum D
{
    A, B, C;

    private D()
    {
        System.out.print('*');
    }
}

public class Demo
{
    public static void main(String[] args)
    {
        Enum enu = D.B;
    }
}
