import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Given Number is Even");
        } else {
            System.out.println("Given Number Is Odd");
        }
    }
}