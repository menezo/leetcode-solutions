package problem0001_TwoSum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Stores the numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();
        // Iterate through the array and get each value
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            // Check if the complement (target - current number) exists in the map
            if (map.containsKey(target - currentNum)) {
                return new int[] { i, map.get(target - currentNum) };
            }
            map.put(currentNum, i);
        }
        return new int[] {};
    }
}
