package 华为机试;

import java.util.Scanner;

public class HJ13_SentenceReverse {
    public static void main(String[] args) {

//        String[] s = new String[];

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //"boo:and:foo"
        //: { "boo", "and", "foo" }
        String[] s = str.split(" ");

        for(int i =s.length-1 ; i>=0 ; i--) {
            System.out.print(s[i]);
        }
    }
}
