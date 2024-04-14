import java.util.*;

public class Main {
    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 1};
        int target = 5;
        int[] result = Solution.getTwoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}

class Solution {
    public static int[] getTwoSum(int[] nums, int target) {
        Map<Integer, Integer> intToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (intToIndex.containsKey(complement)) {
                return new int[] { intToIndex.get(complement), i };
            }
            intToIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException("Not two sum.");
    }
}