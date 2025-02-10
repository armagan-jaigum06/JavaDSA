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
    
    public static int Sum(int a, int b){
        return a + b;
    }

    // Func to calculate sum of 3 nums

    public static int Sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        // int a = 5;
        // int b = 3;
        // // System.out.println(multiply(a, b));
        // int factorial = factorial(3);
        // System.out.println(factorial);

        // System.out.println(BioCoeff(5,2));

        System.out.println(Sum(5,7));
        System.out.println(Sum(5,7 ,5));
        
    }
}