package com.task2;

/**
 * Created by admin on 07.03.2017.
 */
public class Bicycle {
    private static int numberOfBicycles =50;
    private int id;

    public Bicycle(){
        id = ++numberOfBicycles;
    }
    public int getID(){
        return id;
    }

    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        Bicycle b2 = new Bicycle();
        System.out.println(b1.getID());
        System.out.println(b2.getID());
    }
}
