package newbie0;


public class Code5_preSum {

    public static class RangeSum {

        private int[] preSum;

        // 给preSum初始化
        public RangeSum(int[] array) {
            int N = array.length;
            preSum = new int[N];
            preSum[0] = array[0];
            for (int i = 1; i < N; i++) {
                preSum[i] = preSum[i - 1] + array[i];
            }
        }

        public int rangeSum(int L, int R) {
            return L == 0 ? preSum[R] : preSum[R] - preSum[L - 1];
        }
    }


    public static void main(String[] args) {

        int[] array = {3, 5, -1, 7, 2, -6, 1};
        RangeSum rangeSum = new RangeSum(array);
        System.out.println(rangeSum.rangeSum(1, 5));


    }

}
