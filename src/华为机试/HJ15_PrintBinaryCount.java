package 华为机试;

import java.util.Scanner;

public class HJ15_PrintBinaryCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for(int i = 0 ; i<32 ; i++) {
            if((n&1) == 1) {
                count++;
            }
            n = n >>> 1;
        }
        System.out.println(count);
    }
}
