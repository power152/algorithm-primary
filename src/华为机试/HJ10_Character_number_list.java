package 华为机试;

import java.util.HashSet;
import java.util.Scanner;

public class HJ10_Character_number_list {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0 ;
        while(scan.hasNextLine()) {
            String str = scan.nextLine();
            char[] ch = str.toCharArray();

            HashSet<Character> set = new HashSet<>();
            for (int i = 0;i<ch.length;i++) {
                if (ch[i] >= 0 && ch[i] <=127) {
                    if (!set.contains(ch[i])) {
                        set.add(ch[i]);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
