import java.util.Scanner;

public class syntaxParameters {

    // Method to demonstrate syntax and parameters
    public static void exampleMethod() {
        System.out.println("Hello World");
        return;
    }

    public static void printSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("sum of the given number is " + sum);
    }

    // swap

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A : " + a );
        System.out.println("B : " + b );
    }

    // multiply

    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }
    // Factorial

    public static int factorial(int n){
        int f = 1;
        for(int i = 1 ;i <= n; i++){
            f = f*i;
        }
        return f;
    }

    // Bionomial Coefficiant

    public static int BioCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int bio_coeff = fact_n / (fact_r * fact_nmr);
        return bio_coeff;
    }

    // Func to calculate sum of 2 nums
    
    // public static int Sum(int a, int b){
    //     return a + b;
    // }

    // Func to calculate sum of 3 nums

    // public static int Sum(int a, int b, int c){
    //     return a + b + c;
    // }

    // Func to calculate sum of 2 integer
    
    public static int Sum(int a, int b){
        return a + b;
    }

    // Func to calculate sum of 2  flot

    public static float Sum(float a, float b){
        return a + b;
    }

    // Check Prime num or not for >= 2

    // public static boolean isPrime(int n){
    //     boolean isPrime = true;

    //     if(n == 2){
    //         return isPrime;
    //     }


    //     for(int i = 2; i <= n-1; i++){
    //         if (n % i == 0) {
    //             isPrime = false;
    //             break;
                
    //         }
    //     }
    //     return isPrime;
    // }

    // Check Prime num or not for >= 2 optimised oproch here we take sqrt of n it run less code so is tpmised aproch

    public static boolean isPrime(int n){
        if (n == 2) {
            return true;            
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    // Print All Primes in Range

    public static void PrimesInRange(int n){
        for(int i = 2 ; i<= n; i++){
           if (isPrime(i)) {
            System.out.print(i + " ");
            
           }
        }
    }

    // Binary to decimal converter

    public static void BinToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigt = binNum % 10;
            decNum = decNum + lastDigt * ((int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;            
        }
        System.out.print("Decimal of " + myNum + " is " + decNum);
    }

    // Decimal to binary converter

    public static void DecToBin(int decNum){
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + rem * (int)Math.pow(10, pow);        
            pow++;
            decNum = decNum/2;
        }
        System.out.print("Binary of " + myNum + " is " + binNum);

    }

    public static void main(String[] args) {
        // int a = 5;
        // int b = 3;
        // // System.out.println(multiply(a, b));
        // int factorial = factorial(3);
        // System.out.println(factorial);

        // System.out.println(BioCoeff(5,2));

        // System.out.println(Sum(5,7));
        // System.out.println(Sum(5.1f,7.9f));

        // System.out.println(isPrime(3));
        // PrimesInRange(20);

        // BinToDec(1011);

        DecToBin(5);
        
    }
}