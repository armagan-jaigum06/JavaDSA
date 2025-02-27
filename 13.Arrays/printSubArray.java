public class printSubArray {

    public static void printSubarray(int num[]){
        int ts=0;
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                for(int k =i; k<=j; k++){
                    System.out.print(num[k] + " ");
                    ts++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Tatal Number of Array is : "+ ts);
    }
    public static void main(myString[] args) {
        int num[] = {2, 3, 5, 6, 8, 9};
        printSubarray(num);
    }
}
