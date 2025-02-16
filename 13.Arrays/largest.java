import java.util.*;

public class largest {

    public static int largestNumber(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < number.length; i++){
            if(number[i] > largest){
                largest = number[i]; 
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {4, 9, 0, 2, 5, 10};
        int target = largestNumber(number);
       System.out.println("Largest Numbert is Available in the index of : " + target);
    }
}
