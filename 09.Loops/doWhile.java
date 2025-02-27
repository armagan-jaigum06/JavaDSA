import java.util.Scanner;

public class doWhile {
    public static void main(myString[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break; // Exit the loop if the number is a multiple of 10
            }
            System.out.println("This is not a multiple of 10: " + n);
        } while (true);
        sc.close(); // Close the Scanner object
    }
}