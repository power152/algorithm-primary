package 华为机试;

import java.util.Scanner;


/**
 * 方法parseInt(String s,int radix)的目的是输出一个十进制数，这个数字是“String s”但是我们要知道他是多少进制的，而方法中“int radix”参数正是来表达这个信息的。
 *
 * 比如：parseInt(1010,2)
 * 意思就是：输出2进制数1010在十进制下 的数.
 * 更直白地说： parseInt(String s,int radix)就是求“int radix”进制数“String s”的十进制数是多少。
 */
public class HJ5_Exchange_Ten_System {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String s = str.substring(2);
        System.out.println(Integer.parseInt(s,16));
    }
}
