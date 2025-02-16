import java.util.*;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value : A ");
        int a = sc.nextInt();
        System.out.println("Enter Value : B ");
        int b = sc.nextInt();
        System.out.println("Enter Value : C ");
        int c = sc.nextInt();
        int sum = (a + b + c);
        System.out.println("Average of the above number is : " + sum/3);
        sc.close();
    }
    
    
}
