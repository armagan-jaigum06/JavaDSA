import java.util.Scanner;

public class Else_If {
    public static void main(myString[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income In Lacs");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = (int) (income * 0);
        } else if (income >= 500000 && income <= 100000){
            tax = (int) (income * 0.2);
        } else{
            tax = (int) (income * 0.3);
        }
        System.out.println("Your tax Is : " + tax);
        sc.close();
    }
    
}
