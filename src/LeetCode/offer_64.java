package LeetCode;

/**
 * @author Kiteye
 * @date 14/8/2022
 * @Description 剑指offer的 64题
 */

public class offer_64 {
    public int sumNums(int n) {
        // flag ->true or false; true 就递归
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
