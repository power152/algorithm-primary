package 华为机试;

import java.util.Scanner;

public class Hj86_求最大连续bit数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


            int num = scan.nextInt();
            int count = 0;
            int max = 0;
            while (num != 0) {
                if ((num & 1) == 1) {
                    count++;
                    max = Math.max(count,max);
                } else {
                    count = 0;
                }
                num >>>= 1;
            }
            System.out.println(max);

    }
}
