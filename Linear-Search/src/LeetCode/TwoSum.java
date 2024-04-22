package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] mums = {2,5,5,11};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(mums, target)));
    }


    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int j = 1;
            while (j < nums.length){
                if(i==j){
                    j++;
                    continue;
                } else if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
                j++;
            }
        }
        return new int[]{-1,-1};

        // less time complexity
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement)) {
//                return new int[]{map.get(complement), i};
//            }
//            map.put(nums[i], i);
//        }
//
//        return new int[]{-1, -1};
    }
}
