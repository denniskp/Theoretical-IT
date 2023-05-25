package de.tosoxdev.theoreticalit.sem1;

import java.util.Scanner;

public class Fibonacci {
    public static long getFibonacci(int n) {
        if (n <= 1)
            return n;

        long fibPrevious = 1;
        long fibCurrent = 1;

        for (int i = 2; i < n; i++) {
            long buffer = fibCurrent + fibPrevious;
            fibPrevious = fibCurrent;
            fibCurrent = buffer;
        }

        return fibCurrent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which number from the fibonacci sequence should be calculated?: ");
        int n = scanner.nextInt();

        long nFibonacci = getFibonacci(n);

        System.out.printf("The number at position %d is %d", n, nFibonacci);
    }
}
