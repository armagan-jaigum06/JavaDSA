public class SearchAndRotate {

    public static int search(int arr[], int targ, int si, int ei){
        if (si > ei) {
            return -1;
        }
        // Kaam
        int mid = si + (ei-si)/2;

        // case to found
        if (arr[mid] == targ) {
            return mid;
        }
        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a : Left
            if (arr[si] <= targ && targ <= arr[mid]) {
                return search(arr, targ, si, mid-1);
            }
            // case b: Right
            else{
                return search(arr, targ, mid+1, ei);
            }
        }
        // mid on L2
        else{
            // Case c: Right
            if (arr[mid] <= targ && mid <= arr[ei]) {
                return search(arr, targ, mid+1, ei);
            }
            // Case d : laeft
            else {
                return search(arr, targ, si, mid-1);
            }
        }
    }
	public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}
