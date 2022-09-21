package 华为机试;

import java.util.Scanner;

/**
 * 这种情景题一般是要把例子都分析下来，然后找规律
 */

public class HJ37_统计兔子每个月的总数 {
    public static int Fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Fibonacci(n));
    }
}
