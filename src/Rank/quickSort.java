package Rank;

import java.util.Arrays;

/**
 * @author Kiteye
 * @date 7/10/2022
 * @Description 快速排序
 */

public class quickSort {
    public static int patition(int[] array, int start, int end) {
        int tmp = array[start];
        while (start < end) {
            // start<end 防止有序数组的时候 end 超过 start
            while (start < end && array[end] >= tmp) {
                end--;
            }
            array[start] = array[end];
            while (start < end && array[start] <= tmp) {
                start++;
            }
            array[end] = array[start];
        }
        array[start] = tmp;
        return start;
    }

    // 待排序区间
    public static void quick(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = patition(array, left, right);
        quick(array, left, pivot - 1);
        quick(array, pivot + 1, right);

    }

    public static void quickso(int[] array) {
        quick(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 3, 9, 5};
        System.out.println(Arrays.toString(array));
        quickso(array);
        System.out.println(Arrays.toString(array));

    }
}
