package 华为机试;

import java.util.Scanner;

// 庆祝自己自己写出来了代码，撒花，虽然是简单，嘻嘻，开心

public class HJ84_统计大写字母个数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int count = 0;
            String str = scan.nextLine();
            for (int i = 0 ;i<str.length();i++) {
                char ch = str.charAt(i);
                if (ch >='A' && ch<= 'Z') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
