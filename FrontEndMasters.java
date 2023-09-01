/*
 * FrontEnd Masters Complete Intro to Computer Science
 * Brian Holt
 */

import java.util.Arrays;

public class FrontEndMasters {

    public static void main(String[] args) {
        int[] a = {7, 1, 4, 3, 8, 2};
        insertionSort(a);
        System.out.println(Arrays.toString(a));


    }

    public static void bubbleSort(int[] a) {
        boolean swap = false;
        while (!swap) {
            swap = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swap = false;
                }
            }
        }
    }

    public static void insertionSort(int[] a) {
        //a[0] - is already sorted
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void insertionSort2(int[] a) {
        int i, j;
        for (i = 1; i < a.length; i++) {
            j = i;
            while (j > 0 && a[j] < a[j - 1]) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
            }
        }
    }

}
