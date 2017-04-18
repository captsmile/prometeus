package com.task5;

/**
 * Created by Vitalii on 10.04.2017.
 */
interface Iface1
{
    String a = "A";
    String methodA();
}

interface Iface2 extends Iface1
{
    String b = "B";
    String methodB();
}

class Demoq implements Iface1, Iface2
{
    public String methodA()
    {
        return a+b;
    }

    public String methodB()
    {
        return b+a;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Demoq demo = new Demoq();
        System.out.println(demo.methodA());
        System.out.println(demo.methodB());
    }
}

