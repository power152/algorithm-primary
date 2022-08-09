package LeetCode;

import java.util.HashMap;

/**
 * @author Kiteye
 * @date 9/8/2022
 * @Description 寻找重复的数，HashMap可以统计次数，适合用
 */

public class LeetCode_287 {
    public int findDuplicate(int[] nums) {
        // 统计次数用HashMap
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return num;
            } else {
                map.put(num, 1);
            }
        }
        return 0;
    }
}
