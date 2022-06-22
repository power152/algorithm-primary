package pactise;

/**
 * @author liuyandeng
 * @date 31/5/2022
 * @Description
 */

public class FrontSum {

    public static class RangeSum {
        private int[] preSum;

        // 需要初始化 前缀和 -> PreSum
        public RangeSum(int[] array) {

            int N = array.length;
            preSum = new int[N];
            preSum[0] = array[0];

            // 小心数组越界，从1开始，下面代码 要 i-1，初始化是 0 的话，i-1就不行了
            for (int i = 1; i < N; i++) {
                preSum[i] = preSum[i - 1] + array[i];
            }
        }

        public int rangSum(int L, int R) {
            return L == 0 ? preSum[R] : preSum[R] - preSum[L - 1];
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 5, -1, 7, 2, -6, 1};
        RangeSum rangeSum = new RangeSum(array);

        System.out.println(rangeSum.rangSum(1, 4));

    }
}
