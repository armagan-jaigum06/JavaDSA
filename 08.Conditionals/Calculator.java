import java.util.Scanner;

public class Calculator {
    public static void main(myString[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value A");
        int A = sc.nextInt();
        System.out.println("Enter value B");
        int B = sc.nextInt();
        System.out.println("Enter the operator you want to use (+, -, *, /, %):");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(A + B);
                break;
            case '-':
                System.out.println(A - B);
                break;
            case '*':
                System.out.println(A * B);
                break;
            case '/':
                if (B != 0) {
                    System.out.println(A / B);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case '%':
                if (B != 0) {
                    System.out.println(A % B);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("You entered an invalid operator.");
        }
        sc.close();
    }
}
