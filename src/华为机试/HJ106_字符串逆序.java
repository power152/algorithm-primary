package 华为机试;

import java.util.Scanner;

public class HJ106_字符串逆序 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sb.append(ch);
        }
        sb.reverse();
        System.out.println(sb);
    }
}
