package LeetCode;

import java.util.Arrays;

/**
 * @author Kiteye
 * @date 18/8/2022
 * @Description 雪糕的最大数量    https://leetcode.cn/problems/maximum-ice-cream-bars/
 * 使用排序加 贪心算法
 */

public class LeetCode_1833 {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] <= coins) {
                coins = coins - costs[i];
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}





