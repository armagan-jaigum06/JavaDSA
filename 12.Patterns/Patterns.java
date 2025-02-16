public class Patterns {

    public static void hollow_rectangle(int totRows, int totCols){
        // Outer Loops
        for(int i = 1; i <= totRows; i++){
            //inner - colms
            for(int j = 1; j <= totCols; j++){
                // cell (j,i)
                if (i ==1 || i == totRows || j == 1 || j == totCols) {
                    // Boundary Cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void inverted_rotated_half_pyramid(int n){
        // Outer
        for(int i = 1 ; i <= n; i++){
            // Spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            // Star
            for(int j = 1;j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_num(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }

    public static void floyds_triangle(int n){
        int counter = 1;
        for(int i = 1; i<=n; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(counter +" ");
            counter++;
        }
        System.out.println();
    }
}
    public static void zero_one_triangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        // 1st half
        for(int i = 1; i<= n; i++){
            //stares - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // spaces 2*(n-i)
            for(int j = 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            // stars - 1
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            //stares - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // spaces 2*(n-i)
            for(int j = 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            // stars - 1
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n){
        for(int i = 1; i <= n; i++){
            // Spaces
            for(int j = 1; j <= (n-i); j++ ){
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void holo_rhombus(int n){
        for(int i =1 ; i<= n; i++){
            // spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=n ; j++){
                if(i == 1 || j == 1 ||  i == n || j ==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void dimond_pattern(int n){
        for(int i = 1; i<= n; i++){
            // space
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j<= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n ; i>=1; i--){
           // space
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j<= ((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void number_pyramid(int n){
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromic_pattern_number(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // hollow_rectangle(4,6);
        // inverted_rotated_half_pyramid(9);
        // inverted_half_pyramid_num(6);
        // floyds_triangle(5);
        // zero_one_triangle(6);
        // butterfly(500);
        // solid_rhombus(7);
        // holo_rhombus(5);
        // dimond_pattern(6);
        // number_pyramid(5);
        palindromic_pattern_number(9);
    }
}
