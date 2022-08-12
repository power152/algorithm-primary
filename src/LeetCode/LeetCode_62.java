package LeetCode;

/**
 * @author Kiteye
 * @date 12/8/2022
 * @Description 不同路径 ； 经典的动态规划
 * 动态规划三步骤：
 * 1、有初始值；
 * 2、方程式； （推出方程式最难）
 * 3、终止条件
 */



// 二维数组 [][] 行 列；行可以省略
public class LeetCode_62 {
    public int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];
        for (int i = 0; i < m; i++) {
            f[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            f[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                f[i][j] = f[i - 1][j] + f[i][j - 1];
            }
        }
        return f[m - 1][n - 1];
    }
}
