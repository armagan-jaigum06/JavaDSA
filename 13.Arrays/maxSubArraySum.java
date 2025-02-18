public class maxSubArraySum {

    // Brute Force 
    public static void maxSubArrSu(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                currSum = 0;
                for(int k =i; k<=j; k++){
                   currSum += num[k];
                } 
                System.out.println(currSum + " ");
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum of Array is : "+ maxSum);
    }

    // Prefix Sum

    public static void maxSubArr(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        // Calculate Prefix Array
        for(int i = 1; i <prefix.length; i++){
            prefix[i] = prefix[i-1]+num[i];
        }

        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum of Array is : "+ maxSum);
    }
    // Method 3

    public static void kadanes(int number[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i < number.length; i++){
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our Max Sub Array Sum is : " + ms);
    }

    public static void main(String[] args) {
        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(num);
        
    }
}
 