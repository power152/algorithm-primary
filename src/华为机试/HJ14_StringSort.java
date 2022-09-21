package 华为机试;

import java.util.Arrays;
import java.util.Scanner;


/**
 * 这里要分清楚nextLine（）和next（）的用法：
 * .next()方法：
 * 获取到当前行，同时再切换到下一行，这个操作类似于i++;会过滤掉有效字符前面的无效字符，对输入有效字符之前遇到的空格键、
 * Tab键或Enter键等结束符，next()方法会自动将其过滤掉；只有在读取到有效字符之后，next()方法才将其后的空格键、Tab键或Enter键等视为结束符;
 *
 * .nextLine()：
 * 读取的是一行，遇到空格不会结束，通常用在String里面；它的结束符只能是Enter键，
 * 即nextLine()方法返回的是Enter键之前没有被读取的所有字符，它是可以得到带空格的字符串的。
 */

public class HJ14_StringSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] strarr = new String[n];
        for(int i = 0; i< n ; i++) {
            strarr[i] = scan.next();
        }
        Arrays.sort(strarr);
        System.out.println();

        System.out.println("=====================");
        for(String str:strarr) {
            System.out.println(str);
        }
    }
}
