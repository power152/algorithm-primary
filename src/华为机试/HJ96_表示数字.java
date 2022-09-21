package 华为机试;

import java.util.Scanner;

public class HJ96_表示数字 {
    public static boolean isNumble(char c) {
        if (c >= '0' && c<='9'){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            StringBuffer sb = new StringBuffer();
            char[] chars = scan.nextLine().toCharArray();
            int flg =0;//0代表前一个是字符，1代表是数字

            for (int i=0 ; i< chars.length ; i++) {

                if (isNumble(chars[i]) && flg == 0) {
                    sb.append('*');
                    sb.append(chars[i]);
                    flg = 1;//上一个字符，变成数字

                    // 当前是字母，前一个是数字
                } else if (!isNumble(chars[i]) && flg == 1) {
                    sb.append('*');
                    sb.append(chars[i]);
                    flg = 0; // 前一个是数字。
                } else{
                    sb.append(chars[i]);
                }

            }
            if (isNumble(chars[chars.length-1]) ) {
                sb.append('*');
            }
            System.out.println(sb.toString());
        }

    }
}
