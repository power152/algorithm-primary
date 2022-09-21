package 华为机试;


import java.util.Scanner;

public class Last_word_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int length = str.length();
        int count =0;
        for (int i = length - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                break;

            }
            count++;
        }
        System.out.println(count);
    }
}
