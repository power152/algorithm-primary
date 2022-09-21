package 华为机试;

import java.util.Scanner;

public class HJ87_密码强度等级 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            char[] ch = scan.nextLine().toCharArray();
            int score = 0;

            //求字符串长度
            int length = ch.length;
            if (length <= 4) {
                score += 5;
            } else if (length >= 5 && length <= 7) {
                score += 10;
            } else {
                score += 25;
            }

            int upLetter = 0;
            int lowLetter = 0;
            int digit = 0;
            int others = 0;

            // 统计字母
            for (int i = 0; i < length; i++) {
                if (Character.isUpperCase(ch[i])) {
                    ++upLetter;
                } else if (Character.isLowerCase(ch[i])) {
                    ++lowLetter;
                } else if(Character.isDigit(ch[i])){
                    ++digit;
                } else {
                    ++others;
                }
            }

            //字母分数
            if ((upLetter > 0 && lowLetter == 0) || (upLetter == 0 && lowLetter > 0)) {
                score += 10;
            } else if (upLetter > 0 && lowLetter > 0) {
                score += 20;
            } else {
                score += 0;
            }

            // 数字分数
            if (digit == 1) {
                score += 10;
            } else if (digit > 1) {
                score +=20;
            } else {
                score += 0;
            }

            if (others == 1) {
                score +=10;

            } else if (others > 1) {
                score += 25;
            } else {
                score += 0;
            }

            // 奖励
            if (upLetter > 0 && lowLetter > 0 && digit > 0 && others >0) {
                score += 5;
            } else if (digit > 0 && others > 0 && (upLetter >0 || lowLetter >0)) {
                score += 3;
            } else {
                score += 2;
            }

            if (score >= 90) {
                System.out.println("VERY_SECURE");
            } else if (score >= 80) {
                System.out.println("SECURE");
            } else if(score >= 70) {
                System.out.println("VERY_STRONG");
            } else if (score >= 60) {
                System.out.println("STRONG");
            } else if (score >= 50) {
                System.out.println("AVERAGE");
            } else if (score >=25) {
                System.out.println("WEAK");
            } else {
                System.out.println("VERY_WEAK");
            }

        }
    }
}
