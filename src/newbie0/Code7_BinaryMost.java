package newbie0;

import java.util.Arrays;

public class Code7_BinaryMost {
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
            int mid = (left + right) / 2;

            if (array[mid] >= num) {
                answear = mid;
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return answear;
    }


    // 有序数组中找到 <=num 最右的位置
    public static int mostrightNoLessNumIndex(int[] array, int num) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int length = array.length;
        int left = 0;
        int right = length - 1;
        int answear = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] <= num) {
                answear = mid;
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }
        return answear;
    }

    // for test
    public static int test(int[] arr, int value) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= value) {
                return i;
            }
        }
        return -1;
    }

    // for test
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    // for test
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
            if (test(arr, value) != mostrightNoLessNumIndex(arr, value)) {
                printArray(arr);
                System.out.println(value);
                System.out.println(test(arr, value));
                System.out.println(mostrightNoLessNumIndex(arr, value));
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }


    // 测试用例是检验  有序数组中找到 =>num 最左的位置

//    // for test
//    public static int[] generateRandomArray(int maxSize, int maxValue) {
//        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
//        }
//        return arr;
//    }
//
//    // for test
//    public static void printArray(int[] arr) {
//        if (arr == null) {
//            return;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        int testTime = 500000;
//        int maxSize = 10;
//        int maxValue = 100;
//        boolean succeed = true;
//        for (int i = 0; i < testTime; i++) {
//            int[] arr = generateRandomArray(maxSize, maxValue);
//            Arrays.sort(arr);
//            int value = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
//            if (test(arr, value) != mostLeftNoLessNumIndex(arr, value)) {
//                printArray(arr);
//                System.out.println(value);
//                System.out.println(test(arr, value));
//                System.out.println(mostLeftNoLessNumIndex(arr, value));
//                succeed = false;
//                break;
//            }
//        }
//        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
//    }

}
