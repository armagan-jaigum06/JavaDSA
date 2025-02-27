public class Assignment {

    public static int multiply(int n){
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans*n;
            }
            n = n*n;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(multiply(2));
        
    }
}
