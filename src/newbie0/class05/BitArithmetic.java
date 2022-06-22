package newbie0.class05;

/**
 * @author liuyandeng
 * @date 22/6/2022
 * @Description 位运算实现 + - * /
 */

public class BitArithmetic {

    public static int add(int a, int b) {
        /**
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

}
