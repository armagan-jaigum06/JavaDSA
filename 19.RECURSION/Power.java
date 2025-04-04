public class Power {

    public static int optimisedPower(int a, int n){
        if (n == 0) {
            return 1;
        }
        int halfPower = optimisedPower(a, n/2);
        int halfPowerSQ = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSQ = a * halfPowerSQ;
        }
        return halfPowerSQ;
    }
    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        System.out.println(optimisedPower(a, n));
    }
}
