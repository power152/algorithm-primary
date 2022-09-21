package LeetCode;

/**
 * @author Kiteye
 * @date 21/8/2022
 * @Description 1381. 设计一个支持增量操作的栈
 */

public class LeetCode_1381 {
    int[] stack;
    int top;
    public LeetCode_1381(int maxSize) {
        stack = new int[maxSize];
        top = -1;
    }

    public void push(int x) {
        if(top != stack.length-1) {
            ++top;
            stack[top] = x;
        }
    }

    public int pop() {
        if(top == -1) {
            return -1;
        }
        --top;
        return stack[top+1];

    }

    public void increment(int k, int val) {
        int limit = Math.min(k , stack.length);
        for(int i = 0 ;i < limit ;i++) {
            stack[i] += val;
        }
    }
}
