public class Assignment {

    // Q.1 Average of three number

    public static int avgCal(int a, int b, int c){
        int sum = a+b+c;
        return sum/3;
    }

    // Q.2 isEven Arguments

    public static boolean isEven(int num){
            if (num % 2 == 0) {
                return true;
            }
            else {
                return false;
         }
    }
    public static void main(String[] args) {
        // System.out.println(avgCal(2,1 ,8));

        System.out.println(isEven(5));
    }
}
