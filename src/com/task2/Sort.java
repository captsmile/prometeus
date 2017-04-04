package com.task2;

/**
 * Created by admin on 24.02.2017.
 */
public class Sort {
    public static void main(String[] args) {
        int[] array = {11111, -1110, 0, 1,55,67,23,11,67};
        int length = array.length;

        //PUT YOUR CODE HERE
/*        int j=0;
        for (int i=0; i <length-1-j; i++){
            for(j=0; j <length-1; j++){
                if (array[j]>array[j+1] ){
                    int swap = array[j+1];
                    array[j+1] = array[j];
                    array[j] = swap;
                }
            }
            j=0;
        }*/

        //PUT YOUR CODE HERE

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        //SHELL

        int swap;
        int j;
        for(int k = length/2; k > 0; k /= 2) {
            for (int i = k; i < length; i += 1) {
                swap = array[i];

                for (j = i; j >= k; j -= k) {
                    if (swap < array[j - k])
                        array[j] = array[j - k];
                    else
                        break;
                }
                array[j] = swap;
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
