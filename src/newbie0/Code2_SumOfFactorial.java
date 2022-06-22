
package newbie0;

/**
 * 给定一个参数 N
 * 返回：1！+2！+3！........+N!的结果。
 */

public class Code2_SumOfFactorial {
    //两种方式
    // 方法一：蠢方法
    public static long f1(int N) {
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            answer += factorial(i);
        }
        return answer;
    }

    public static long factorial(int N) {
        long answer = 1;
        for (int i = 1; i <= N; i++) {
            answer = answer * i;
        }
        return answer;
    }

    // 方法2：聪明方法。
    public static long f2(int N) {
        // 用这个当前的值，然后来记录上一次阶层的结果。
        long curNum = 1;
        long answer = 0;
        for (int i = 1; i<=N; i++) {
            curNum = curNum * i;
            answer = answer+curNum;
        }
        return answer;
    }

    public static void main(String[] args) {
        int N = 6;
        long ret = f1(N);
        System.out.println(ret);
        System.out.println(f2(N));

    }
}
