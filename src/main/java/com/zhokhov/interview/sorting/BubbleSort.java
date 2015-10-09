/*
 *  You are free to use this code anywhere, copy, modify and redistribute at your
 *  own risk.
 *  Your are solely responsibly for any damage that may occur by using this code.
 *
 *  This code is not tested for all boundary conditions. Use it at your own risk.
 */
package com.zhokhov.interview.sorting;

import static com.zhokhov.interview.util.Console.*;

/**
 * @author <a href='mailto:alexey@zhokhov.com'>Alexey Zhokhov</a>
 */
public class BubbleSort {

    public void sort(int[] array) {
        for (int reverseIndex = array.length - 1; reverseIndex > 1; reverseIndex--) {
            ____grey("------\nreverseIndex: " + reverseIndex);

            for (int i = 0; i < reverseIndex; i++) {
                ____grey("i: " + i);

                if (array[i] > array[i + 1]) {
                    ____blue("Swapping: " + i + " and " + (i + 1));

                    // Swap code
                    int temp = array[i];

                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {7, 1, 8, 2, 0, 12, 10, 6, 5, 3};

        __yellow("\nNew array: ");
        __dump(array);

        System.out.println("\nSorting\n");

        new BubbleSort().sort(array);

        __green("\nResult: ");
        __dump(array);

        System.out.print("\n");
    }

}