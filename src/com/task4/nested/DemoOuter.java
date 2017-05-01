package com.task4.nested;

/**
 * Created by Vitalii on 01.05.2017.
 */
public class DemoOuter {
    public static void main(String[] args) {
        OuterClass.NestedClass nested = new OuterClass.NestedClass();
//редко
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        OuterClass.InnerClass inner2 = new OuterClass().new InnerClass();


    }
}
