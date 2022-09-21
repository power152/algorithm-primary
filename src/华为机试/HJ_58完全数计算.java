package 华为机试;

import java.util.Scanner;

public class HJ_58完全数计算 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()) {
            int num = scan.nextInt();

            //第一个完全数就是6
            if (num<6) {
                System.out.println(0);
                continue;
            }

            int count = 0;
            for (int t = 6;t<=num;t++) {
                int sum = 0;
                // 求因数，然后因数求和 ; t/2 可以提升效率，但是一定是 <=
                for (int i = 1; i<=t/2;i++) {
                    if (t%i == 0) {
                        sum += i;
                    }
                }
                // 因数和 == 原数 那么count++
                if (sum == t) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
