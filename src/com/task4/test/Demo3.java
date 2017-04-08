package com.task4.test;

/**
 * Created by Vitalii on 08.04.2017.
 */
public class Demo3 {
    //OuterClass.NestedClass nested = new OuterClass.NestedClass().i;


    OuterClass outer = new OuterClass();
    OuterClass.InnerClass inner = outer.new InnerClass();
}
