package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Kiteye
 * @date 15/8/2022
 * @Description
 */

public class LeetCode_137 {
    public int singleNumber(int[] nums) {
        // HashMap 来计算次数
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
