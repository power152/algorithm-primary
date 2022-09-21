package 华为机试;

import java.util.Scanner;

public class HJ31_单词倒排 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            char[] ch = str.toCharArray();
            // 遍历整个字符串，非字符就用空格代替
            for (char c : ch) {
                // isLetter() 方法用于判断指定字符是否为字母。
                if (!Character.isLetter(c)) {
                    // 不是字符用空格代替
                    str = str.replace(c, ' ');
                }
            }
            // 该反转了
            String[] strArr = str.split(" ");
            for (int i = strArr.length-1; i >= 0; i--) {
                System.out.print(strArr[i] + " ");
            }
        }
    }
}
