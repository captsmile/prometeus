package com.task2;

public class Matr {
    public static void main(String[] args) {
        int j;
        for(int i=1;i<=25;i++){
            if (((i-1)%6==0) || ((i-1)%4==0)) {
                System.out.print(" * ");
                if (i%5==0) System.out.println();
                continue;
            }

            if (i<10) System.out.print(" "+i+" ");
            else System.out.print(i+" ");

            if (i%5==0) System.out.println();

        }
    }
}
