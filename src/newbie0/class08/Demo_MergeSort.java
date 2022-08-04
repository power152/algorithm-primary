package newbie0.class08;

import java.util.Arrays;

/**
 * @author Kiteye
 * @date 13/7/2022
 * @Description
 */

public class Demo_MergeSort {

    // 递归版本
    public static void mergeSort1(int[] array) {
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
            // 这个地方一定是 <= 呀，小于是不行的，如果等于也要先放进去
            if (array[s1] <= array[s2]) {
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
            array[i + left] = tmp[i];
        }
    }


    public static void mergeSort2(int[] array) {
        if (array == null || array.length < 2) return;

        int step = 1;
        int len = array.length;
        // step >= 总长度的时候就可以结束循环了，因为，等于总长度，右边就没有可比的数了
        while (step < len) {
            int L = 0;
            while (L < len) {
                int M = 0;
                // 考虑边界，当剩下的那个数只有一位，那么mid是不存在的
                //int M = Math.min(L+step-1,len-1);

                // 假如 某左组 XXX    step=4    那就让 M = 数组的最后一位置 len-1
                // L..len-1 之间的范围 ，len-1+L+1
                if (len - L >= step) {
                    M = L + step - 1;
                } else {
                    M = len - 1;
                }

                // L...M  如果说M== len-1 说明没有 右组 结束跳出循环
                if (M == len - 1) break;

                // 左组已经考虑完了，该考虑右组的边界了,右组的边界跟左组的边界是一样的思维
                // 有右组，找出右组的第一个
                int R1 = M + 1;
                int R = 0;
                // (len-1)-(M+1)+1  ---> len-1-M-1+1 ---> len-1-M
                if (len - 1 - M >= step) {
                    // 右组的最后位置 R = M+1+step-1
                    R = M + step;
                } else {
                    R = len - 1;
                }

                // L....M   M+1....R
                // 范围划分好就merger
                merge(array, L, R, M);

                // 现在一个step组就完毕了，需要进行下一组的左组开始排序
                // 也是要防止越界的问题，如果下一个左组L=R+1 越界了也就是这个数组的最后一个数 就直接结束循环
                if (R == len - 1) {
                    break;
                } else {
                    L = R + 1;
                }

            }

            /**
             * step *= 2; 这么写不安全，因为当step接近最大长度的时候再乘2 就越界了
             * intMax = 2^31-1
             * step = 2^30
             * 但是最后再乘以2，就是 2^31 >intMax
             */
            if (step > len / 2) { //大于总长度的一半，就让他跳出循环，因为这个大于一般的2倍是大于总长度
                break;
            }
            step *= 2;
        }
    }


    public static void main1(String[] args) {
        int[] array = {6, 2, 1, 5, 9};
        System.out.println(Arrays.toString(array));
        mergeSort2(array);
        System.out.println(Arrays.toString(array));

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
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    // for test
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
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

    // for test
    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        System.out.println("测试开始");
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            mergeSort1(arr1);
            mergeSort2(arr2);
            if (!isEqual(arr1, arr2)) {
                System.out.println("出错了！");
                printArray(arr1);
                printArray(arr2);
                break;
            }
        }
        System.out.println("测试结束");
    }

}
