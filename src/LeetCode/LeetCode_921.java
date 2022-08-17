package LeetCode;

/**
 * @author Kiteye
 * @date 17/8/2022
 * @Description
 */

public class LeetCode_921 {

    public int minAddToMakeValid(String s) {

        // 可以不用使用栈
        int left = 0; // 为消耗的左括号数量
        int count = 0;
        char[] c = s.toCharArray();
        for(int i = 0;i<s.length();i++) {
            if(c[i] ==  '(') {
                left++;
            } else { // 这是右括号
                if(left>0) {  // 还有没消耗左括号的数量
                    left--; // 左括号先--
                } else {

                    // 1、()) 遇到右括号没有可以消耗的左括号
                    count++; // 遇见右括号，没有左括号了就添加
                }
            }
        }
        // "() ((" 2、有剩余的左括号
        count+=left;
        return count;
    }
}
