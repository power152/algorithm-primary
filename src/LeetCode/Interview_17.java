package LeetCode;

/**
 * @author Kiteye
 * @date 26/8/2022
 * @Description 面试题 按摩师，跟198. 打家劫舍差不多。
 * https://leetcode.cn/problems/the-masseuse-lcci/submissions/
 */

public class Interview_17 {
    public int massage(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }

        // dp 初始化
        int[] dp = new int[len + 1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], nums[0]);

        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
