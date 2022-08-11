package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author Kiteye
 * @date 11/8/2022
 * @Description 最小时间差
 */

public class LeetCode_539 {
    public int findMinDifference(List<String> timePoints) {
        int[] minute = new int[timePoints.size()];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < timePoints.size(); i++) {
            minute[i] = Integer.parseInt(timePoints.get(i).substring(0, 2)) * 60
                    + Integer.parseInt(timePoints.get(i).substring(3, 5));
        }
        Arrays.sort(minute);
        for (int i = 0; i < minute.length - 1; i++) {
            min = Math.min(min, minute[i + 1] - minute[i]);

        }
        return Math.min(min, 1440 + minute[0] - minute[minute.length - 1]);

    }

    public static void main(String[] args) {
        List<String> timePoints = Arrays.asList("23:59", "00:00");
        int min = new LeetCode_539().findMinDifference(timePoints);
        System.out.println(min);
    }
}
