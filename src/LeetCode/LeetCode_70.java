package LeetCode;

/**
 * @author Kiteye
 * @date 11/8/2022
 * @Description 爬楼梯，动态规划
 */

public class LeetCode_70 {
    public int climbStairs(int n) {
        int[] f = new int[n + 1];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 1];
        }
        return f[n];
    }

}
