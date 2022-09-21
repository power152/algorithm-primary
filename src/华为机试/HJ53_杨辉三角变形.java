package 华为机试;

import java.util.Scanner;

/**
 * 这道题只是找规律，不是打印杨辉三角图形
 */


public class HJ53_杨辉三角变形 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()) {
            int n = scan.nextInt();
            if(n == 1 || n == 2) {
                System.out.println(-1);
                continue;
            } else if(n%4 == 1 || n%4 == 3) {
                System.out.println(2);
                continue;
            } else if(n%4 == 0) {
                System.out.println(3);
                continue;
            } else if(n%4 == 2) {
                System.out.println(4);
                continue;
            }
        }
    }
}
