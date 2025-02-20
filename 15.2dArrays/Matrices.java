import java.util.Scanner;

public class Matrices {

    public static int largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest number of the given matrix is : " + largest);
        return largest;
    }

    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if (matrix[i][j] == key) {
                    System.out.println("Found at the key of : ("+ i+" , "+j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of the matrix");
        int n = sc.nextInt();
        System.out.println("Enter the column of the matrix");
        int m=sc.nextInt();
        int matrix[][] = new int[n][m];
          
        // input 
        System.out.println("Enter the number of the matrix");
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output

        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5);
        // largest(matrix);
    }
}
