package 华为机试;

import java.util.Scanner;

public class HJ_60查找组成一个偶数最接近两个素数 {

    public static boolean isPrime(int num) {
        for (int i =2 ;i<Math.sqrt(num) ; i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void solution(int num) {
        // 两个最接近的素数
        // 遍历 找到所有的素数，然后那两个的差值最小就输入就是最接近的。
        int min = Integer.MAX_VALUE;
        int[] result = new int[2];
        // 从2开始遍历，因为素数除1和他本身
        for (int i = 2; i<num ;i++) {
            if (isPrime(i) && isPrime(num -i)) {
                // 判断那两个是最小差
                if (Math.abs(num-i-i) < min) {
                    result[0] = i;
                    result[1] = num-i;
                    min = Math.abs(num-i-i);
                }
            }
        }
        System.out.println(result[0] + "\n" + result[1]);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()) {
            int num = scan.nextInt();
            if (num%2 !=0 || num <=2) {
                System.out.println("请输入一个偶数");
                continue;
            }
            solution(num);
        }
    }
}
