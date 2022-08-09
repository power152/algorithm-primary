package LeetCode;

/**
 * @author Kiteye
 * @date 9/8/2022
 * @Description 跳跃游戏 II
 */

public class LeetCode_45 {

    public int jump(int[] nums) {
        // 使用边界法， 贪婪算法
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}
