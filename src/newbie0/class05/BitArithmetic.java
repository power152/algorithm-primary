package newbie0.class05;

/**
 * @author Kiteye
 * @date 22/6/2022
 * @Description 位运算实现 + - * /
 */

public class BitArithmetic {

    public static int add(int a, int b) {
        /**
         *  加法：
         *  按位异或“^" 有一个无进位相加的结论
         *  两数相加 conclusion ： (a^b) + 进位信息的结果。
         *  such as：46+20 = 66
         *  46：0010 1110    20：0001 0100
         *    0010 1110                         0010 1110
         * ^  0001 0100                       & 0001 0100
         *    0011 1010  --> 58                 0000 0100   <<1
         *                                      0000 1000 ---> 8
         *    58+8 = 66;
         *    最后循环的条件是 没有进位信息的时候停止循环，返回 conclusion。
         */

        int sum = a;
        while (b != 0) {
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return sum;
    }

    // 正数--->负数
    public static int negNum(int n) {
        return add(~n, 1);
    }

    public static int minus(int a, int b) {
        /**
         * 减法:
         * 就是在加法的基础上按位取反+1  --->  add(a,b) --->add(a,~b+1) ---> add(a,add(~b,1))
         * such as:
         * 5 : 0000 0101
         * -5: 取反+1
         *     1111 1010+1 ---> 1111 1011(这是补码）想要转换成十进制数要化成原码，补码的补码就是原码
         *     1111 1011 原
         *     1000 0100 反码（符号位不变，其他按位取反）
         *     1000 0101 补码（反码+1） ---》 5
         */

        return add(a, negNum(b));
    }

    public static int multiplication(int a, int b) {
        /**
         * 乘法：
         *  a: 0110
         *  b: 0101
         * 1、b 不等于 0 循环继续
         * 2、b & 1 ---> 0101
         *            &  0001
         *               0001  不等于0 继续
         * 3、a的结果 0110 放入 result 中
         * 4、a 向左移动 1位 ---> 01100
         * 5、b 向右移动1位（无符号） ---> 010
         * ..............  无限循环，直到 b 等于 0 结束循环。
         */
        int result = 0;
        while (b != 0) {
            if ((b & 1) != 0) {
                result = add(result, a);
            }
            a <<= 1;  // 左移，低位补0
            b >>>= 1; // 无符号 右移
        }
        return result;
    }

    public static boolean isNeg(int n) {
        return n < 0;
    }

    public static int div(int a, int b) {
        // 除法不能有 负数 ，前提条件都规定成正数
        int x = isNeg(a) ? negNum(a) : a;
        int y = isNeg(b) ? negNum(b) : b;
        int result = 0;
        for (int i = 30 ;  i >= 0 ; i = minus(i, 1)){
            if ((x >> i) >= y){
              result |= (1 << i);
              x = minus(x,y<<i);
            }
        }

        return isNeg(a) != isNeg(b) ? negNum(result) :result;
    }

    // 这个函数的意义是 系统最小值 没有绝对值，没有正数
    public static int divide (int a , int b){
        if (a == Integer.MIN_VALUE && b == Integer.MIN_VALUE) {
            return 1;
        } else if (b == Integer.MIN_VALUE){
            return 0;
        } else if (a == Integer.MIN_VALUE){
            if (b == negNum(1)) {
                return Integer.MIN_VALUE;  // leetcode 规定设为最小值
            } else {
                /**
                 *  a/b
                 *  (a+1)/b==c  最小值一般跟最大值相差一位，
                 *  a-(b*c)==d
                 *  d/b == e
                 *  c+e
                 */
                int c = div(add(a, 1), b);
                return add(c, div(minus(a, multiplication(c, b)), b));
            }
        } else {
            return div(a,b);
        }
    }
}
