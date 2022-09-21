package 华为机试;

import java.util.HashSet;
import java.util.Scanner;


public class HJ9_non_repeating {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuffer sb = new StringBuffer(str);
        HashSet set = new HashSet();
        sb.reverse();
        for (int i = 0; i< sb.length() ; i++) {
            if (set.add(sb.substring(i,i+1))) {
                System.out.println(sb.substring(i,i+1));
            }
        }

    }
}
