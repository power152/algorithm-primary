package 华为机试;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * 瓶子数n   喝水数   剩余瓶子数
 * 0         0       0
 * 1         0       0
 * 2         1       0
 * 3         1       1
 * 4         2       0
 * 5         2       0
 * 6         3       1
 * 7         3       1
 * 8         4       0
 * 9         4       1
 * 10        5       0
 * 由此可以推算出来，喝水数是瓶子数/2 向下取整floor 或者直接int类型
 **/

public class HJ22_Bottle_of_water {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        while(scan.hasNext()) {
            int num = scan.nextInt();
            if (num == 0) {
                break;
            } else {
                array.add(num/2);
            }
        }

        for (int number:array) {
            System.out.println(number);
        }
    }
}
