package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Kiteye
 * @date 5/8/2022
 * @Description  全排列
 */

public class LeetCode_46 {
    // 回溯法
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer,Boolean> visited = new HashMap<>();
        for(int num:nums) {
            visited.put(num,false);
        }
        backtracking (nums,result,visited, new ArrayList<>());
        return result;
    }
    public void backtracking(int[] nums,List<List<Integer>> result,HashMap<Integer,Boolean>
            visited,ArrayList<Integer> list) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i = 0;i<nums.length;i++) {
            int num = nums[i];
            if(!visited.get(num)) {
                list.add(num);
                visited.put(num,true);
                backtracking(nums,result,visited,list);
                list.remove(list.size()-1);
                visited.put(num,false);
            }

        }
    }
}
