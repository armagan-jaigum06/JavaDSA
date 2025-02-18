public class Assignment {

    public static boolean repeatNum(int num[]){
        for(int i = 0 ; i < num.length; i++){
            for(int j = i+1; j < num.length; j++){
                if (num[i] == num[j]) {
                    return true;                    
                }
            }
        }
        return false;      
    }

    public static int waterTrapAfterRaining(int height[]){
        int n = height.length;

        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        int rightMax[] = new int[height.length];
        rightMax[n-1]= height[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;

        for(int i = 0; i < n ; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel-height[i]; 
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        // int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        // System.out.println(repeatNum(nums));
        int height[] = {4, 2, 0, 3, 2, 5};
        System.out.println(waterTrapAfterRaining(height));
    }
}
