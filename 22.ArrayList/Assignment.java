import java.util.*;

public class Assignment {

    // ✅ Question 1: Monotonic check
    public static boolean Monotonic(ArrayList<Integer> list) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                isDecreasing = false;
            } else if (list.get(i) > list.get(i + 1)) {
                isIncreasing = false;
            }
        }

        return isIncreasing || isDecreasing;
    }

    // ✅ Question 2: Lonely numbers
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();

        if (nums.size() == 1) {
            list.add(nums.get(0));
            return list;
        }

        // First element
        if (Collections.frequency(nums, nums.get(0)) == 1 && nums.get(0) + 1 < nums.get(1)) {
            list.add(nums.get(0));
        }

        // Middle elements
        for (int i = 1; i < nums.size() - 1; i++) {
            int curr = nums.get(i);
            if (Collections.frequency(nums, curr) == 1 &&
                nums.get(i - 1) + 1 < curr &&
                curr + 1 < nums.get(i + 1)) {
                list.add(curr);
            }
        }

        // Last element
        int lastIndex = nums.size() - 1;
        if (Collections.frequency(nums, nums.get(lastIndex)) == 1 &&
            nums.get(lastIndex - 1) + 1 < nums.get(lastIndex)) {
            list.add(nums.get(lastIndex));
        }

        return list;
    }

    
    // ✅ Your original main method (unchanged)
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(3);
        System.out.println(Monotonic(list));
        System.out.println(findLonely(list));
    }
}
