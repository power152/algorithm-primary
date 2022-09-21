package 华为机试;

import java.util.Scanner;

/**
 * 1601 / 1399 = 1....202
 * 1399 / 202 = 6...187
 * 202 / 187 = 1....15
 * 187 / 15 =12...7
 * 15 / 7 = 2 .... 1
 *
 * 最后如果余数不是0，再次循环辗转相除，直到余数为0，最后一次运算的除数就是 最大公约数。
 */


public class HJ108_求最小公倍数 {

    public static int getMaxNum(int n1,int n2) {
        // 设 n1 为两个数中最大数
        if (n1 < n2) {
            int tmp = n1;
            n1 = n2;
            n2 = tmp;
        }
        // k 为余数
        int k = 0;
        while(n2 != 0) {
            k = n1%n2;
            n1 = n2;
            n2 = k;
        }
        // 这里可以 背一下 返回的是除数，最后换的时候，就是换到了 n1 ，之前的最大值。
        return n1;
    }

    // 当求出最大公约数为x后，通过 a * b /x 即可求得最小公倍数。
    // 这是一个公式用背下来
    public static int minMultiple(int n1, int n2) {
        return (n1*n2)/getMaxNum(n1,n2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        System.out.println(minMultiple(n1,n2));
    }


}
