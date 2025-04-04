public class Assignment {

    public static void allOccurance(int arr[], int key, int i){
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i+" ");
        }
        allOccurance(arr, key, i+1);
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if (n == 1) {
            System.out.println("Transfer disk "+ n + " from "+src+ " to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+ n + " from "+src+ " to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 5, 7, 2, 7, 2, 8, 9, 2};
        int key = 2;
        // allOccurance(arr, key, 0);
        int n = 2;
        towerOfHanoi(n, "S", "H", "D");
    }
}
