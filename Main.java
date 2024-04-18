import java.util.*;

public class Main {
    public static void main(String args[]) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 1};
        int target = 5;
        int[] result = solution.getTwoSum(nums, target);
        System.out.println(Arrays.toString(result));
        
    }
}

class Solution {
    public int[] getTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalAccessError("Two Sum");
    }
}