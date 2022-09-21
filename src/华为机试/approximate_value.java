package 华为机试;

import java.util.Scanner;

public class approximate_value {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num = scan.nextFloat();
        if (num<0) {
            System.out.println("请输入正整数");
        }
        System.out.println(num - (int)num >= 0.5 ?(int)num+1 : (int)num);
    }
}
