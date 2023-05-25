package de.tosoxdev.theoreticalit.sem2;

import java.util.Arrays;

public class InsertionSort_T1_3 {
    public static void InsertionSort(int[] A) {
        for (int p = 1; p < A.length; p++) {
            int key = A[p];
            int i = p - 1;
            while ((i >= 0) && (A[i] > key)) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] a1 = { 3, 6, 5, 4, 1, 2, 4 };
        InsertionSort(a1);
        System.out.println(Arrays.toString(a1));
    }
}
