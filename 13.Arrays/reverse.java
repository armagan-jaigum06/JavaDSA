public class reverse {

    public static void reverseNum(int number[]){
        int start = 0, end = number.length-1;
        while (start<end) {
            int temp = number[end];
            number[end] = number[start];
            number[start]= temp;

            start++;
            end--;
        }
    }
    public static void main(myString[] args) {
        int number[] = {1, 2, 4, 7, 8, 9};
        reverseNum(number);
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
    }   
}