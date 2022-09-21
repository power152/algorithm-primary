package LeetCode;

/**
 * @author Kiteye
 * @date 22/8/2022
 * @Description 343. 整数拆分  https://leetcode.cn/problems/integer-break/
 */

public class LeetCode_343 {
    public int integerBreak(int n) {
        int[] dp = new int[n+1]; // 因为for循环是 <=n ,dp是数组下标是0开始的，故n+1
        if (n < 2) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= n; i++) {
            for (int j = 1; j < i-1; j++) { // 从多少开始分割，初始化肯定是有分割一次，i就是总的发拆分次数 ，假如n=4，可拆分为1+3=1+（1+2）=1+1+（1+1），共拆分了3次
                dp[i] = Math.max(dp[i], dp[j] * dp[i - j]);
            }
        }
        return dp[n];
    }
}
