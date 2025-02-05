import java.util.Scanner;

public class Loops {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // int counter = 1;
    // while (counter <= 10) {
    //     System.out.println(counter + " Hello World");  
    //     counter ++;      
    // }
    // System.out.println("Hello World Printed 10x times");

    // print 1 to n nmber
    System.out.println("Enter N");
    int range = sc.nextInt();
    int counter = 1;
    while (counter <= range) {
        System.out.println(counter);
        counter ++;
        
    }
}    
}
