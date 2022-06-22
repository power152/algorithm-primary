package newbie0;


public class Code4_SelectSort {
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void selectSort(int[] arr) {
        // 判断不可取情况
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        // 先遍历整个数组
        // 0-n-1
        // 1-n-1
        // 2-n-1
        for (int i = 0; i <= N - 1; i++) {
            int minValue = i;
            for (int j = i + 1; j <= N - 1; j++) {
                minValue = arr[j] < arr[minValue] ? j : minValue;
            }
            swap(arr, i, minValue);
        }
    }


    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // 换行的作用
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 8, 6, 9, 4, 7, 3, 1};
        printArr(arr);
        selectSort(arr);
        printArr(arr);
    }
}
