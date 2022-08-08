package LeetCode;

import java.util.PriorityQueue;

/**
 * @author Kiteye
 * @date 8/8/2022
 * @Description 数组中的第k个最大元素 使用的是堆排序
 * 1、最大堆
 * 2、只有k个元素的最小堆
 */

public class LeetCode_215 {
    public int findKthLargest(int[] nums, int k) {
        // 自动生成的是小堆
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num :nums) {
            queue.add(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }
}
