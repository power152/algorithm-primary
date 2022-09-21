package 华为机试;

import java.util.Scanner;

public class HJ40_统计字符 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int letter = 0;
        int space = 0;
        int number = 0;
        int others = 0;
        String str = scan.nextLine();
        int length = str.length();
        for (int i = 0; i<length ; i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                letter++;
            } else if (Character.isSpaceChar(ch)) {
                space++;
            } else if (Character.isDigit(ch)) {
                number++;
            } else {
                others++;
            }
        }

        System.out.println(letter);
        System.out.println(space);
        System.out.println(number);
        System.out.println(others);


    }
}
