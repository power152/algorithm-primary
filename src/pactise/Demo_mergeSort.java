package pactise;

import java.util.Arrays;

/**
 * @author Kiteye
 * @date 12/7/2022
 * @Description 归并排序
 */

public class Demo_mergeSort {

    // 递归版本
    public static void mergeSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        process(array, 0, array.length - 1);
    }

    private static void process(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        process(array, left, mid);
        process(array, mid + 1, right);
        merge(array, left, right, mid);

    }

    private static void merge(int[] array, int left, int right, int mid) {
        int[] tmp = new int[right - left + 1];
        int k = 0;

        int s1 = left;
        int e1 = mid;

        int s2 = mid + 1;
        int e2 = right;


        while (s1 <= e1 && s2 <= e2) {
            if (array[s1] < array[2]) {
                tmp[k++] = array[s1++];
            } else {
                tmp[k++] = array[s2++];
            }
        }
        while (s1 <= e1) {
            tmp[k++] = array[s1++];
        }
        while (s2 <= e2) {
            tmp[k++] = array[s2++];
        }
        for (int i = 0; i < k; i++) {
            // 右边合并的时候，不可能从0小标开始，故 array[i] = tmp [i] 是错误写法，这样写，只能每次是0下标开始，
            // 是有 i+left ，右边合并的时候才能真正找到left。
            array[i+left] = tmp[i];
        }
    }




    public static void main(String[] args) {
        int[] array = {6,2,1,5,9};
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

}
