import java.util.Scanner;

public class Conditionals {

    public static void main(myString[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Given Number is Even");
        } else {
            System.out.println("Given Number Is Odd");
        }
        sc.close();
    }
}