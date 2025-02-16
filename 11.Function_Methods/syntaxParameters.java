import java.util.Scanner;

public class SyntaxParameters {

    // Method to demonstrate syntax and parameters
    public static void exampleMethod() {
        System.out.println("Hello World");
        return;
    }

    public static void printSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum of the given numbers is " + sum);
    }

    // Swap
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }

    // Multiply
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    // Factorial
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // Binomial Coefficient
    public static int binomialCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int binomialCoeff = fact_n / (fact_r * fact_nmr);
        return binomialCoeff;
    }

    // Function to calculate sum of 2 integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Function to calculate sum of 2 floats
    public static float sum(float a, float b) {
        return a + b;
    }

    // Check if a number is prime
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Print all primes in range
    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Binary to decimal converter
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + lastDigit * ((int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + myNum + " is " + decNum);
    }

    // Decimal to binary converter
    public static void decToBin(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + rem * (int) Math.pow(10, pow);
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary of " + myNum + " is " + binNum);
    }

    public static void main(String[] args) {
        // Example usage of methods
        // exampleMethod();
        // printSum(5, 3);
        // swap(5, 3);
        // System.out.println("Product: " + multiply(5, 3));
        // System.out.println("Factorial: " + factorial(5));
        // System.out.println("Binomial Coefficient: " + binomialCoeff(5, 2));
        // System.out.println("Sum (int): " + sum(5, 7));
        // System.out.println("Sum (float): " + sum(5.1f, 7.9f));
        // System.out.println("Is Prime: " + isPrime(3));
        // primesInRange(20);
        // binToDec(1011);
        decToBin(5);
    }
}