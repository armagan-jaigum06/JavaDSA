public class binarySearch {

    public static int binarySerch(int number[], int key){
        int start = 0, end = number.length-1;
        while (start <= end) {
            int mid = (start + end)/2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(myString[] args) {
        int number[] = {4, 9, 10, 20, 45, 80, 90};
        int key = 45;
        int binSer = binarySerch(number, key);
        if(binSer == -1){
            System.out.println("Key is Not Found");
        } else {
            System.out.println("Key is in the index of : " + binSer);
        } 
    }
}
