package de.tosoxdev.theoreticalit.sem2;

import java.util.Arrays;

public class MergeSort_T1_3 {
    public static void Merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];
        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = A[q + j];
        }
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for (int k = p; k < r; k++) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
        }
    }

    public static void MergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (int) Math.floor((double) (p + r) / 2);
            MergeSort(A, p, q);
            MergeSort(A, q + 1, r);
            Merge(A, p, q, r);
        }
    }

    public static void main(String[] args) {
        int[] A = { 5, 3, 20, 54, 10, 50, 49, 69, 7, 4, 2, 0 };
        MergeSort(A, 0, A.length);
        System.out.println(Arrays.toString(A));
    }
}
