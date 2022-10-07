package LeetCode;

import java.util.Arrays;

/**
 * @author Kiteye
 * @date 6/8/2022
 * @Description 颜色分类
 *
 * 说白了可以用排序算法，但是可以学习下，答案中的颜色分类。
 */

public class LeetCode_75 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void sortColors(int[] nums) {

        boolean flg =false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flg = true;
                }
            }
            if (flg == false) {
                break;
            }
        }
    }


}
