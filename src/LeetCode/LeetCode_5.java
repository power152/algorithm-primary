package LeetCode;

/**
 * @author Kiteye
 * @date 23/8/2022
 * @Description 最长回文子串
 * 暴力法，
 * 动态规划
 */



public class LeetCode_5 {
    public static String longestPalindrome(String s) {

        int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxLen = 1;
        int begin = 0;

        char[] charArray = s.toCharArray(); // 转换成字符数组，方便下面回文.

        // 注意下标越界！！！！！
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (j - i + 1 > maxLen && palindrome(charArray, i, j)) {
                    // j-i+1  是字符串的长度，s[b...e],长度就是b-e+1;
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }

        return s.substring(begin, begin + maxLen);
    }


    // 判断回文数
    public static boolean palindrome(char[] charArray, int left, int right) {
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String sb = "cbbd";
        String n = longestPalindrome(sb);
        System.out.println(n);

    }
}
