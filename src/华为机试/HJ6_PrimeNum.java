package 华为机试;

import java.util.Scanner;


/**
 * 分解质因数，从最小的开始不停除法，除到为1，或者，除到最后除不了，就输出自己。
 *
 * 例如180：180%2=0 那么2为质因数 输出2  （num=num/2=90)
 *
 *                  90%2=0  那么2为质因数 输出2   （num=num/2=45)
 *
 *                  45%2!=0
 *
 *                  45%3=0  那么3为质因子 输出3  （num=num/3=15)
 *
 *                  15%3=0  那么3为质因子 输出3  （num=num/3=5)
 *
 *                  5%3!=0
 *
 *                  5%4!=0
 *
 *                  5%5=0  那么5为质因子 输出5 （num=num/5=1)
 */

public class HJ6_PrimeNum {
    // 质数：他的因子只有 1 和 他本身
    // such as：3,5,7.。。。


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int k = (int) Math.sqrt(num);
        for (int i = 2; i <= k; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }
        // 判断如果num不等于 1 则输出num
        //必须加上不然超时间
        System.out.println(num == 1 ? "" : num + " ");





        // 求素数 :素数是1 和他本身
        // 除了1和它本身以外不再有其他因数的自然数。
//        for (int i = 2; i <= 100; i++) {
//            boolean flg = true;
//            for (int j = 2; j <= i - 1; j++) {
//                if (i%j == 0) {
//                    flg=false;
//                    break;
//                }
//            }
//
//            if (flg) {
//                System.out.print(i+" ");
//            }
//        }


    }
}
