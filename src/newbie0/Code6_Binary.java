package newbie0;

import java.util.Arrays;



public class Code6_Binary {
    /**
     * @author Kiteye
     * @date
     * @Description 二分查找
     */
    // 普通二分发，有序数组
    public static boolean BinarySeacher(int[] array, int num) {
        //判断边界
        if (array == null || array.length == 0) {
            return false;
        }
        int length = array.length;
        int left = 0;
        int right = length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == num) {
                return true;
            } else if (array[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }


    // 有序数组中找到 =>num 最左的位置
    public static int mostLeftNoLessNumIndex(int[] array, int num) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int length = array.length;
        int left = 0;
        int right = length - 1;
        int answear = -1;
        while (left <= right) {
            int mid = (left+right)/2;
            if (array[mid] < num) {
                answear = mid;
                right = mid - 1;

            } else {
                left = mid +1;
            }
        }
        return answear;
    }

    // for test
    public static boolean test(int[] sortedArr, int num) {
        for (int cur : sortedArr) {
            if (cur == num) {
                return true;
            }
        }
        return false;
    }


    // for test 测试用例
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 10;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr = generateRandomArray(maxSize, maxValue);
            Arrays.sort(arr);
            int value = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
            if (test(arr, value) != BinarySeacher(arr, value)) {
                System.out.println("出错了！");
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }
}
