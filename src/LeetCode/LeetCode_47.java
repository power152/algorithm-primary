package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Kiteye
 * @date 5/8/2022
 * @Description
 */

public class LeetCode_47 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null) {
            return result;
        }
        Arrays.sort(nums);
//        Boolean[] isVisited = new Boolean[nums.length];
        backtracking(new ArrayList<Integer>(), nums, new boolean[nums.length]);
        return result;
    }

    public void backtracking(ArrayList<Integer> list, int[] nums, boolean[] Isvisited) {
        // 回溯法，要递归
        if (list.size() == nums.length) {
            result.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1] && !Isvisited[i - 1]) {
                continue;
            }
            if (!Isvisited[i]) {
                list.add(nums[i]);
                Isvisited[i] = true;
                backtracking(list, nums, Isvisited);
                Isvisited[i] = false;
                list.remove(list.size() - 1);
            }


        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(new LeetCode_47().permuteUnique(nums));
    }

}
