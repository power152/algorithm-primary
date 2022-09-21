package Arithmetic;

/**
 * @author Kiteye
 * @date 23/8/2022
 * @Description BF 暴力算法
 */

public class BF {
    public static int TestBf(String str, String sub) {
        if (str == null || sub == null) {
            return -1;
        }
        int lenStr = str.length();
        int lenSub = sub.length();
        if (lenStr == 0 || lenSub == 0) {
            return 0;
        }
        int i = 0;
        int j = 0;

        while (i < lenStr && j < lenSub) {
            if (str.charAt(i) == sub.charAt(j)) {
                i++;
                j++;
            } else {
                // 匹配不同就回到该回的位置
                i = i - j + 1;
                j = 0;
            }

        }
        // j > lenSub 说明找到子串，否则没有子串
        if (j >= lenSub) {
            return i - j;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(TestBf("kdjfoeiaw","jfoe"));//2
        System.out.println(TestBf("kdjfoeiaw","kdjf"));//0
        System.out.println(TestBf("kdjfoeiaw","jfoeo"));//-1
    }
}
