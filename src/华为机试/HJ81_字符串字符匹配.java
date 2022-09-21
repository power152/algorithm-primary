package 华为机试;

import java.util.HashSet;
import java.util.Scanner;

public class HJ81_字符串字符匹配 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            HashSet<Character> set = new HashSet<>();
            String shortStr = scan.next();
            String longStr = scan.next();

            // 长字符串加入set里面
            char[] longChars = longStr.toCharArray();
            for (char ch : longChars) {
                set.add(ch);
            }

            // 短字符串查看是否包含在set中，不是就把标志为改为false
            boolean flg = true;
            char[] shortChars = shortStr.toCharArray();
            for (char ch : shortChars) {
                if (!set.contains(ch)) {
                    flg = false;
                    break;
                }
            }
            System.out.println(flg);
        }
    }
}
