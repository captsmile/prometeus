package com.task4.test;

/**
 * Created by Vitalii on 08.04.2017.
 */
class A
{
    public static void main(String[] args) {
        //int a = new OuterClass.InnerClass().i;
        Demo3.Seasons a = Demo3.Seasons.WINTER;
        System.out.println("season.name()=" + a.name() + " season.toString()=" + a.toString() + " season.ordinal()=" + a.ordinal());
        System.out.println(Demo3.Seasons.class.getSuperclass());
    }
}
