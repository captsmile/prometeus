package com.task4.Sort;

/**
 * Created by Vitalii on 10.04.2017.
 */
public class Comparator {
    public int compare(int a, int b){
        if (a>b) {
            return 1;
        } else if (a == b){
            return 0;
        } else {
            return -1;
        }
    }
}
