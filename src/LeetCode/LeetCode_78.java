package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kiteye
 * @date 4/8/2022
 * @Description 子集 中等难度
 */
public class LeetCode_78 {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();

        public List<List<Integer>> subsets(int[] nums) {

            result.add(new ArrayList<Integer>());
            backtracking(nums,0);
            return result;
        }

        public void backtracking(int[] nums,int start) {
            // 递归就要有终止条件
            if(start >= nums.length) {
                return;
            }

            for(int i = start ;i< nums.length;i++) {
                list.add(nums[i]);
                result.add(new ArrayList<Integer>(list));
                backtracking(nums,i+1);
                list.remove(list.size()-1);
            }
    }
}
