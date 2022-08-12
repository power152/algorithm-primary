package LeetCode;

import java.util.List;

/**
 * @author Kiteye
 * @date 12/8/2022
 * @Description 最小路径和，经典动态规划 ; 自底向上
 */

public class LeetCode_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        int n = triangle.size();
        int m = triangle.get(n - 1).size();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = triangle.get(i).size() - 1; j >= 0; j--) {
                if (i == n-1) {
                    dp[i][j]= triangle.get(i).get(j);
                } else {
                    dp[i][j]=Math.min(dp[i+1][j+1],dp[i+1][j]) + triangle.get(i).get(j);
                }
            }
        }
        return dp[0][0];
    }
}
