package com.task5;

/**
 * Created by Vitalii on 10.04.2017.
 */
interface A
{
    void test();
}

class Test implements A
{
    public void test()
    {
        System.out.println("Ok");
    }

    public static void main(String[] args) {
        Test t = new Test();
    }

}

