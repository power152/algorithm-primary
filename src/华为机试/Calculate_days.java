package 华为机试;

import java.util.Scanner;

public class Calculate_days {
    public static int outDays(int years, int month, int day) {
        int[] Day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // 排除的情况
        if (years <= 0 || month > 12 || day <= 0 || day > 31) {
            return -1;
        }
        // 判断闰年
        if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
            Day[1] = 29;
        }

        // 计算天数和了;
        int sum = 0;
        //!! i < month-1
        for (int i = 0; i < month - 1; i++) {
            sum = sum + Day[i];
        }
        return sum + day;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int years = scan.nextInt();
        int month = scan.nextInt();
        int day = scan.nextInt();
        int days = outDays(years, month, day);
        System.out.println(days);

    }
}
