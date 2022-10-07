package Rank;

import java.util.Arrays;

/**
 * @author Kiteye
 * @date 22/9/2022
 * @Description 选择排序
 */

public class SelectSort {
    /**
     * 时间复杂度：O(n^2)  不管有序还是无序的情况
     * 空间复杂度：o(1)
     * 稳定性：不稳定的排序
     *
     * 可以优化，记录下  当前i下标之后  最小值的下标 才交换
     */
    public static void Selection(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 8, 3, 7, 6};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
