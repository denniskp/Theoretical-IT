package de.tosoxdev.theoreticalit.sem2;

public class InsertionSort_T2_3 {
    public static int LinearSearch(int[] A, int v) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == v) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a1 = { 3, 6, 5, 4, 1, 2, 4 };
        int a1_v = 4;
        int a1_i = LinearSearch(a1, a1_v);
        if (a1_i != -1) {
            System.out.printf("Found %d at index %d\n", a1_v, a1_i);
        } else {
            System.out.printf("The sequence doesn't contain %d\n", a1_v);
        }
    }
}
