package com.task4.nested;

/**
 * Created by Vitalii on 01.05.2017.
 */
public class OuterClass {
    public static class NestedClass{
        void test(){}


    }
    public class InnerClass{
        void test(){}
    }

    private class InnerClass2{
        void test(){

        }
    }

    public void demo(){
        InnerClass inner = new InnerClass();
    }
}
