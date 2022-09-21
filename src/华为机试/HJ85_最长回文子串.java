package 华为机试;

import java.util.Scanner;

public class HJ85_最长回文子串 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            String str = scan.nextLine().toLowerCase();
            int max = 0;
            int length =str.length();
            for (int i =0 ;i<length ; i++){
                for (int j = length ;j>i ;j--) {
                    // 走啊走，当两个指针相等就进行回文判断
                    if (str.charAt(i) == str.charAt(j-1)){
                        // 待判断的子串，
                        String strC = str.substring(i,j);
                        int n = strC.length();
                        String strFront = strC.substring(0,n/2);  // 前半段
                        StringBuffer strAfter = null;  // 后半段
                        // 这个子串是个偶数
                        if (n%2==0) {
                            // 偶数直接截取后半段
                            strAfter = new StringBuffer(strC.substring(n/2));
                        } else {
                            // 奇数，不判断中间字符，直接+1截取后半段
                            strAfter = new StringBuffer(strC.substring(n/2+1));

                        }
                        // 翻转后半段的子串
                        String t = String.valueOf(strAfter.reverse());
                        if (t.equals(strFront)) {
                            max = n >max ? n :max;
                        }
                    }
                }
            }
            System.out.println(max);
        }

    }
}
