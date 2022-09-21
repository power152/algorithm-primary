package SystemClass.class18;

/**
 * @author Kiteye
 * @date 3/9/2022
 * @Description 汉诺塔
 * <p>
 * 使用汉诺塔来理解递归过程
 * 技巧：
 * 一个递归函数增加参数的方式来增加可能性！！！
 * 递归最讲究的是可变参数的设计
 * 遇到深度优先遍历的时候，剪枝比set过滤更好，剪枝会提前杀死重复的。比如：全排列 2
 * <p>
 * 汉诺塔概述：
 * 汉诺塔问题是一个经典的问题。汉诺塔（Hanoi Tower），又称河内塔，源于印度一个古老传说。
 * 大梵天创造世界的时候做了三根金刚石柱子，在一根柱子上从下往上按照大小顺序摞着64片黄金圆盘。
 * 大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上。
 * 并且规定，任何时候，在小圆盘上都不能放大圆盘，且在三根柱子之间一次只能移动一个圆盘。
 * 问应该如何操作？
 */

public class Hanoi {

    public static void hanoi1(int n) {
        leftToRight(n);
    }

    // 请把 1~n 层的盘子从左向右移动
    public static void leftToRight(int n) {
        if (n == 1) {
            System.out.println("Move 1 from left to right");
            return;
        }
        // 盘子数大于1个了
        // 先左向中移一大步 1,2盘子一大步一起移
        leftToMid(n - 1);
        // 只剩下一个盘子，直接移动到右边。
        System.out.println("Move " + n + " from left to right");
        // 再 把中间的 1,2 这一坨移动到最右边即可。
        midToRight(n - 1);
    }


    public static void leftToMid(int n) {
        if (n == 1) {
            System.out.println("Move 1 from left to mid");
            return;
        }
        // 1,2 一大步移动到右边
        leftToRight(n - 1);
        // n 移动到中间
        System.out.println("Move " + n + " from left to mid");
        // 1,2 一大步移动到中间
        rightToMid(n - 1);
    }

    public static void midToRight(int n) {
        if (n == 1) {
            System.out.println("Move 1 from mid to right");
            return;
        }
        midToLeft(n - 1);
        System.out.println("Move " + n + " from mid to right");
        leftToRight(n - 1);
    }

    public static void rightToMid(int n) {
        if (n == 1) {
            System.out.println("Move 1 from right to mid");
            return;
        }
        rightToLeft(n - 1);
        System.out.println("Move " + n + " from right to mid");
        leftToMid(n - 1);
    }

    public static void rightToLeft(int n) {
        if (n == 1) {
            System.out.println("Move 1 from right to left");
            return;
        }
        rightToMid(n - 1);
        System.out.println("Move " + n + " from right to left");
        midToLeft(n - 1);
    }

    public static void midToLeft(int n) {
        if (n == 1) {
            System.out.println("Move 1 from right to left");
            return;
        }
        midToRight(n - 1);
        System.out.println("Move " + n + " from mid to left");
        rightToLeft(n - 1);
    }

    // 前面可以看到太啰嗦了，可以使用增加参数的方法增加可能性。
    // 一个递归函数增加参数的方式来增加可能性！！！
    public static void hanoi2(int n) {
        if (n > 0) {
            function(n, "left", "mid", "right");
        }
    }

    /**
     * @param n     盘子的个数
     * @param from  起点
     * @param other 左右中 都可以走
     * @param to    最终到达的目的地
     */
    public static void function(int n, String from, String other, String to) {
        if (n == 1) {
            System.out.println("Move 1 from right to left");
            return;
        }
        // 让 1,2 这一大步移动到其他位置上
        function(n - 1, from, other, to);
        // n 盘 移动到目的地
        System.out.println("Move " + n + " from mid to left");
        // 让1,2 这一大步移动到最终的目的地。
        function(n - 1, other, to, from);

    }


    public static void main(String[] args) {
        int n = 3;
        hanoi1(n);
        System.out.println("========================");
        hanoi2(n);
    }

}
