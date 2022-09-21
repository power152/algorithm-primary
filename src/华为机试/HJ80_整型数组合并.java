package 华为机试;



import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

// 这道题可以考虑用 Treeset 的用法，特点有序，不重复
public class HJ80_整型数组合并 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()) {
            TreeSet<Integer> set = new TreeSet<>();
            int num1 = scan.nextInt();
            for (int i = 0 ; i< num1 ; i++) {
                set.add(scan.nextInt());
            }

            int num2 = scan.nextInt();
            for (int i = 0; i<num2 ;i++) {
                set.add(scan.nextInt());
            }

            for (int n:set) {
                System.out.print(n);
            }

            System.out.println();
        }
    }
}
