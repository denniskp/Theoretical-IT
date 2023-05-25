package de.tosoxdev.theoreticalit.sem1;

public class GCD {

    /*
    Note:
    Q: What is the gcd of zero and zero?
    A: The definition cannot be used for defining gcd(0, 0), since 0 × n = 0, and zero thus has no greatest divisor.
    However, zero is its own greatest divisor if greatest is understood in the context of the divisibility relation,
    so gcd(0, 0) is commonly defined as 0.
    - Wikipedia
     */

    /**
     * Get the gcd of two numbers using the Euclidean algorithm
     *
     * @param a Number 1
     * @param b Number 2
     * @return The gcd of a and b
     */
    public static int getGcd(int a, int b) {
        if (b == 0)
            return Math.max(-a, a); // If negative inputs are allowed, Math.max is necessary in order to get the correct output

        int remainder = a % b;
        return getGcd(b, remainder);
    }

    public static void main(String[] args) {
        System.out.println("GCD of 4 and 38: " + getGcd(4, 38));
        System.out.println("GCD of 38 and 4: " + getGcd(38, 4));
        System.out.println("GCD of 420 and 0: " + getGcd(420, 0));
        System.out.println("GCD of 0 and 0: " + getGcd(0, 0));
        System.out.println("GCD of 38822 and 188: " + getGcd(38822, 188));
        System.out.println("GCD of -10 and -2: " + getGcd(-10, -2));
    }
}
