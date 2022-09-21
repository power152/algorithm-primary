package 华为机试;

import java.util.HashMap;
import java.util.Scanner;

public class Count_the_character {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 转换成小写
        String str1 = scan.nextLine().toLowerCase();
        String str2 = scan.nextLine().toLowerCase();

        /**
         * ABCabc --> abcabc  replaceAll之后
         * abcabc --> ''bc''bc  他们相减，然后剩下的长度就是替换了的长度
         */
        int num = str1.length() - str1.replaceAll(str2, "").length();
        System.out.println(num);


    }
}
