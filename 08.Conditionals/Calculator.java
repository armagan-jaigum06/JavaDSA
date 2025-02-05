import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value A");
    int A = sc.nextInt();
    System.out.println("Enter value B");
    int B = sc.nextInt();
    System.out.println("Enter the operator what u want to do");
    char operator = sc.next().charAt(0);
    switch (operator) {
        case '+': System.out.println(A+B);            
            break;
        case '-' : System.out.println(A-B);
            break;
        case '*': System.out.println(A*B);            
            break;
        case '/' : System.out.println(A/B);
            break;    
        case '%' : System.out.println(A%B);
            break;    
        default:
        System.out.println("You entered wrong operator");
    }
}    
}
