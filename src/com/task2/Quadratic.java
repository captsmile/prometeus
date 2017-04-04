package com.task2;

public class Quadratic {
    public static void main(String[] args) {
        double a = 34;
        double b = 32.5;
        double c = -0.5;

        double x1, x2, D;

        D = Math.pow(b,2) - 4*a*c;

        if ((a==0) && (b==0)) {
            System.out.println("x1=");
            System.out.println("x2=");
            return;
        }
        if (c==0){
            System.out.println("x1="+0.);
            System.out.println("x2="+0.);
            return;
        }

        if (D<0) {
            System.out.println("x1=");
            System.out.println("x2=");
            return;
        }
        else if (D==0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = x1;
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
            return;
        }
        else {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
            return;
        }



        //PUT YOUR CODE HERE
    }
}
