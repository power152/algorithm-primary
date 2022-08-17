package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kiteye
 * @date 17/8/2022
 * @Description  字母大小写全排列
 *
 * 回溯
 */

public class LeetCode_784 {
    private List<String> list = new ArrayList<>();
    private char[] arr;

    public List<String> letterCasePermutation(String S) {
        arr = S.toCharArray();
        return dfs(0, new StringBuilder());
    }

    public List<String> dfs(int index, StringBuilder sb) {
        // 若下标超出跳出
        if (index >= arr.length) {
            list.add(sb.toString());
            return list;
        }
        dfs(index+1, new StringBuilder(sb).append(arr[index]));
        // 字母
        if (arr[index] >= 'a')
            dfs(index+1, new StringBuilder(sb).append((char)(arr[index]-32)));
        else if (arr[index] >= 'A')
            dfs(index+1, new StringBuilder(sb).append((char)(arr[index]+32)));
        return list;
    }
}
