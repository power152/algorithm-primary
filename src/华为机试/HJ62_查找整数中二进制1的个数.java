package 华为机试;

import java.util.Scanner;

public class HJ62_查找整数中二进制1的个数 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            int count = 0;
            while (n!=0) {
                if ((n&1) == 1) {
                    count++;
                }
                n>>=1;
            }
            System.out.println(count);
        }
    }
}
