package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kiteye
 * @date 4/8/2022
 * @Description
 */

public class LeetCode_77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(n, k, result, 1, new ArrayList<>());
        return result;
    }

    public void backtracking(int n, int k, List<List<Integer>> result, int begin, ArrayList<Integer> list) {
        if (list.size() == k) {
            result.add(new ArrayList<Integer>(list));
            return;

        }
        for (int i = begin; i <= n; i++) {
            list.add(i);
            backtracking(n, k, result, i + 1, list);
            list.remove(list.size() - 1);
        }
    }


}
