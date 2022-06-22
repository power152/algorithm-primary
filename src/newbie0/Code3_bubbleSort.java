package newbie0;

public class Code3_bubbleSort {
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // 方法一：
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        // 0~n-1
        // 0~n-2      ..........
        for (int end = N - 1; end >= 0; end--) {
            // 56  38 ...
            // 两两一组，第二个数与第一个数比较，谁大谁往后。
            for (int second = 1; second <= end; second++) {
                if (arr[second - 1] > arr[second]) {
                    swap(arr, second - 1, second);
                }
            }
        }

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    // 方法二：
    public static void bubbleSort2(int[] arr) {
        // 确定趟数。
        for (int i = 0; i <= arr.length - 1; i++) {
            // 两辆比较 ,-1-i,i是指每一趟完了end都会是排序好最大的数，只需要比较前面的数即可
            for (int j =0;j<arr.length-1-i;j++) {
                if (arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
    }


    // 优化版本的冒泡排序。

    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 8, 1, 9, 6, 2};
        printArr(arr);
        bubbleSort2(arr);
        printArr(arr);
    }
}
