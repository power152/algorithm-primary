package 华为机试;

import java.util.Arrays;
import java.util.Scanner;

public class HJ34_图片整理 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strArr = scan.nextLine();
        char[] chArr = strArr.toCharArray();
        Arrays.sort(chArr);
        StringBuilder sb = new StringBuilder();
        for (char c:chArr) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
