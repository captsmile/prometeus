package com.task5;

/**
 * Created by Vitalii on 10.04.2017.
 */
class Demow
{
    void test(String s){
        System.out.println("String");
    }

    void test(Integer i){
        System.out.println("Integer");
    }
}

public class Demo
{
    public static void main(String[] args)
    {
        Demow demo = new Demow();
        //demo.test(null);
    }
}
