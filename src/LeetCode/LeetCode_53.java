package LeetCode;

/**
 * @author Kiteye
 * @date 13/8/2022
 * @Description 最大子序列和 ，三种方法，
 * 1、暴力法
 * 2、分治法
 * 3、动态规划 【推荐】
 */

public class LeetCode_53 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0]; // 初始化
        int result = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i], dp[i - 1] + nums[i]);
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
//            result = Math.max(dp[i], result);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(dp[i], max);
        }
        return max;
//        return result;
    }


    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = new LeetCode_53().maxSubArray(nums);
        System.out.println(max);
    }
}
