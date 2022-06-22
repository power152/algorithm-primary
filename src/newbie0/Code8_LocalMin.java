package newbie0;

// 局部最小值，二分法可以是无序的

public class Code8_LocalMin {

    public static int oneMinIndex(int[] array) {

        if (array == null || array.length == 0) {
            return -1;
        }
        int n = array.length;
        if (n == 1) {
            return 0;
        }
        if (array[0] < array[1]) {
            return 0;
        }
        if (array[n - 2] > array[n - 1]) {
            return n - 1;
        }
        int left = 0;
        int right = n - 1;
        // 当这个范围内只有两个数的时候就会越界，因为要考虑 mid-1 or mid+1
        // 这里防止数组越界 不能写成 ：left<right
        // 当跳出循环就只有两个值，不会变成一个值
        while (left < right - 1) {
            int mid = (left + right) / 2;
            if (array[mid] < array[mid + 1] && array[mid] < array[mid - 1]) {
                return mid;
            } else {
                if (array[mid] > array[mid - 1]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        // 跳出循环了，说明 left>=right-1, 此时left 就在 right-1 上 ，那么就剩下 left 和 right 两个数，他们两个相比较
        // 肯定有一个数是最小的！！！
        return array[left] < array[right] ? left : right;

    }

    // 生成随机数组，且相邻数不相等
    public static int[] randomArray(int maxLen, int maxValue) {
        int len = (int) (Math.random() * maxLen);
        int[] arr = new int[len];
        if (len > 0) {
            arr[0] = (int) (Math.random() * maxValue);
            for (int i = 1; i < len; i++) {
                do {
                    arr[i] = (int) (Math.random() * maxValue);
                } while (arr[i] == arr[i - 1]);
            }
        }
        return arr;
    }

    // 也用于测试
    public static boolean check(int[] arr, int minIndex) {
        if (arr.length == 0) {
            return minIndex == -1;
        }
        int left = minIndex - 1;
        int right = minIndex + 1;
        boolean leftBigger = left >= 0 ? arr[left] > arr[minIndex] : true;
        boolean rightBigger = right < arr.length ? arr[right] > arr[minIndex] : true;
        return leftBigger && rightBigger;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int maxLen = 100;
        int maxValue = 200;
        int testTime = 1000000;
        System.out.println("测试开始");
        for (int i = 0; i < testTime; i++) {
            int[] arr = randomArray(maxLen, maxValue);
            int ans = oneMinIndex(arr);
            if (!check(arr, ans)) {
                printArray(arr);
                System.out.println(ans);
                break;
            }
        }
        System.out.println("测试结束");

    }
}
