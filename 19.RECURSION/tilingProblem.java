public class tilingProblem {

    public static int tilingProb(int n){
        //Base Case
        if (n == 0 || n ==1) {
            return 1;
        }
        // Kaam
        // Vertical 
        int fnm1 = tilingProb(n-1);

        // Horigental
        int fnm2 = tilingProb(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProb(1));
        
    }
}
