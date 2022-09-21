package 华为机试;


import java.util.Scanner;

// 知道提完全是利用等差数列公式(网上搜索公式），求a1项
public class HJ_76尼科切斯定理 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int sum = (int)Math.pow(n,3);
            // 利用通项公式中的 a1 公式来作答，网上可以查到公式
            int a1  = sum/n-(n-1);
            StringBuffer sb = new StringBuffer(String.valueOf(a1));

            for (int i = 1 ; i < n ; i++) {
                a1 = a1+2;
                sb.append("+");
                sb.append(a1);
            }
            System.out.println(sb);
        }
    }
}
