public class PrintStar {
    public static void main(myString[] args) {

        // Print Star

        // for(int i = 1; i<= 50; i++){
        //     for(int j = 1; j<= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Print Inverted Star

        int n = 40;
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<=n-i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
