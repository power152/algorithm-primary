package LeetCode;

/**
 * @author Kiteye
 * @date 13/8/2022
 * @Description 打家劫舍
 */

public class LeetCode_198 {
    public int rob1(int[] nums) {
        /**
         * 自己做的愚蠢方法，测试用例不能全部通过。
         */
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result = result + nums[i];
        }
        return result;
    }

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }

        // dp 是房间数
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < len; i++) {
            // [i-1]的房子抢了【i】就没抢，【i】抢了就加上金额，下一个就是抢【i-2】的房子
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        //dp中已保存了每个位置的最高金额，遍历取其中最高的就是所有金额最高的
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            max = Math.max(dp[i], max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        int max = new LeetCode_198().rob(nums);
        System.out.println(max);
    }
}
