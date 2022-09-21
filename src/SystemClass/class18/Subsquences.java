package SystemClass.class18;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Kiteye
 * @date 4/9/2022
 * @Description 查找所有的子序列
 * 有了前面的 Hanoi的铺垫，运用多个参数使用的回溯法，增加更多的可能性
 */

public class Subsquences {

    // s -> "abc" 返回所有的子序列
    public static List<String> subs(String s) {
        char[] str = s.toCharArray();
        String path = "";
        List<String> ans = new ArrayList<>();
        process(str, 0, path, ans);
        return ans;
    }

    /**
     * @param str   原参数
     * @param index 来到str[index]字符，index是位置
     * @param path  str[0...index-1]的路径都走过了，之前的决定，全在path上
     * @param ans   str[index...]这还能决定，后面的就是自由选择，把所有生成子序列，放入到ans中
     */
    public static void process(char[] str, int index, String path, List<String> ans) {
        if (index == str.length) {
            ans.add(path);
            return;
        }

        // 没有要index位置的字符，path之前的决定没有变
        process(str, index + 1, path, ans);
        // 要了index位置的字符。
        process(str, index + 1, path + String.valueOf(str[index]), ans);

    }

    public static void main(String[] args) {
        String test = "abcc";
        List<String> ans1 = subs(test);
        for (String str : ans1) {
            System.out.println(str);

        }
    }

}
