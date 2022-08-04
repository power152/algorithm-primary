package SystemClass.class13;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Kiteye
 * @date 18/7/2022
 * @Description 经典贪心算法，何为贪心算法，在一个整体中局部最优是整体最优解就是贪心成功，否则失败
 *
 * 给定一个有字符串组成的数组strs
 * 必须把所有的字符串拼接起来
 * 返回所有可能拼接结果中，字典序最小的结果
 *
 * 这道题两种方法：
 * 1、贪心算法
 * 2、暴力递归
 */

public class greedy_algorithm {
    public static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            return (a + b).compareTo(b + a);
        }
    }

    public static String lowestString2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs, new MyComparator());
        String res = "";
        for (int i = 0; i < strs.length; i++) {
            res += strs[i];
        }
        return res;
    }

}
