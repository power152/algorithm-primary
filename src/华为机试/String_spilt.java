package 华为机试;

import java.util.Scanner;

public class String_spilt {

    public static void spilt(String s) {
        //long length = s.length();
        while (s.length() >= 8) {
            // daga kjol jdks iown
            System.out.println(s.substring(0, 8));
            s = s.substring(8);
        }
        if (s.length() % 8 != 0 && s.length() >0) {
            s = s + "00000000";
            System.out.println(s.substring(0,8));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            spilt(s);

    }
}
