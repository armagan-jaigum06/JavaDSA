public class Assigment {

    // Question 1 Find How many 7 available in 2D matrix
    public static void search(int matrix[][], int key) {
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    total++;
                }
            }
        }
        System.out.println("Count of " + key + " is : " + total);
    }

    // Question 2 print sum of the second row nums
    public static void printSum(int matrix[][]) {
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[1][j];
        }
        System.out.println(sum);
    }

    // Q > 3 Transpose of a matrix
    public static int[][] transposeOfTheMatrix(int matrix[][]) {
        int transpose[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Print matrix
    public static void printMatrix(int matrix[][]) {
        System.out.println("The Matrix is");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(myString[] args) {
        int matrix[][] = {
            {4, 7, 8},
            {8, 8, 7}
        };
        // int key = 7;
        // search(matrix, key);
        // printSum(matrix);
        printMatrix(matrix);
        int[][] transpose = transposeOfTheMatrix(matrix);
        printMatrix(transpose);
    }
}