package 华为机试;

import java.util.Scanner;

public class HJ100_等差数列 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt(); // n项
            int d = 3;
            int a1 = 2;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a1;
                a1 = a1 + d;
            }
            System.out.println(sum);
        }

    }
}
