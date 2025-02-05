import java.util.Scanner;

public class Assignment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // for(int i=0; i<5; i++) {
        // System.out.println("Hello");
        // i+=2;
        // }

        // Factorial number

        // int num;
        // int fact = 1;
        // System.out.print("Enter the number : ");
        // num = sc.nextInt();
        // for(int i = 1; i<= num; i++){
        //     fact *= i;
        // }
        // System.out.print("Factorial of the above number is : " + fact);

        // Multiplication table of N number

        System.out.print("Enter the Number for Print Table : ");
        int num = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(num + " * " + i +" : " + (num*i));

        }
    }
}  
