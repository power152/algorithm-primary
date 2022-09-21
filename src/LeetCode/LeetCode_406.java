package LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Kiteye
 * @date 21/8/2022
 * @Description
 */

public class LeetCode_406 {
    public int[][] reconstructQueue(int[][] people) {
        // 先按照身高降序排序；（身高相同 k值就升序排序）
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return b[0] - a[0];
        });

        LinkedList<int[]> queue = new LinkedList<>();

        for (int[] person:people) {
            queue.add(person[1],person);
        }
        return queue.toArray(new int[queue.size()][]);
    }
}
