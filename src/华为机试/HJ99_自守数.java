package 华为机试;

import java.util.Scanner;

// 使用截取字符串的方式

public class HJ99_自守数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int count = 0;

            for (int i = 0; i <= n; i++) {
                // 平方数
                int sum = i*i;
                String s1 = String.valueOf(i);
                String s2 = String.valueOf(sum);

                // 截取最后一个数，与i比较是否相同
                if (s2.substring(s2.length() - s1.length()).equals(s1)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
