package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kiteye
 * @date 6/8/2022
 * @Description 括号生成
 */

public class LeetCode_22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtracking(n, result, 0, 0, "");
        return result;
    }

    public void backtracking(int n, List<String> result, int right, int left, String str) {
        if (right > left) {
            return;
        }
        if (left == n && right == n) {
            result.add(str);
            return;
        }
        if (left < n) {
            backtracking(n, result, right, left + 1, str + "(");
        }
        if (right < left) {
            backtracking(n, result, right + 1, left, str + ")");
        }
    }
}
