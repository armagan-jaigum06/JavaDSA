public class RecursionBaics {

    public static void printDec(int number){
        if (number == 1) {
            System.out.print(number);
            return;
        }
        System.out.print(number + " ");
        printDec(number-1);
    }

    public static void printInc(int num){
        if (num == 1) {
            System.out.print(num+ " ");
            return;
        }
        printInc(num-1);
        System.out.print(num+ " ");
    }

    public static int printFact(int num){
        if (num == 0) {
            return 1;
        }
        int fact = num * printFact(num-1);
        return fact;
    }

    public static int printSum(int n){
        if (n == 1) {
            return 1;
        }
        int sum = n + printSum(n-1);
        return sum;
    }

    // calculte nth term in fibonacci

    public static int fib(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        int fibn = fib(n-1) + fib(n-2);
        return fibn;
    }

    public static boolean isSorted(int arr[], int i){
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static int firstOccurance(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }

    public static int lastOccurance(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if (isFound == -1 & arr[i]== key) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n){
        if (n == 0) {
            return 1;
        }
        return x * power(x, n-1);
    }

    public static int friendsPairing(int n){
        if (n == 1 || n == 2) {
            return n;
        }
        // choice 
        // Single
        int fnm1 = friendsPairing(n-1);

        // Double
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        // total ways
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }

    public static void printBinStrings(int n, int lastPlace, String str){
        // base case 
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // kaam
        printBinStrings(n-1, 0, str+"0");
        if (lastPlace == 0) {
            printBinStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        // int number = 5;
        // printDec(number);
        // printInc(number);
        // System.out.println(printFact(number));
        // System.out.println(printSum(number));
        // System.out.println(fib(number));
        // int arr[] = {1, 3, 5, 6, 8, 9};
        // System.out.println(isSorted(arr, 0));
        // int arr[] = {1, 5, 7, 9, 0, 3, 0, 0, 0};
        // System.out.println(firstOccurance(arr, 3, 0));
        // System.out.println(lastOccurance(arr, 0, 0));
        // System.out.println(power(2, 3));

        // System.out.println(friendsPairing(4));
        printBinStrings(3, 0, "");
    }
}
