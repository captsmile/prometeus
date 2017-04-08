package com.task4.test;

/**
 * Created by Vitalii on 08.04.2017.
 */
public class OuterClass {
    static class  NestedClass{
        int i;

    }
    public class InnerClass{
        void test(){

        }
    }
    public void demo(){
        InnerClass inner = new InnerClass();
    }
}
