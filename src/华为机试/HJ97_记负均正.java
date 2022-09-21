package 华为机试;

import java.util.Scanner;

public class HJ97_记负均正 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            int countD = 0;
            int countS = 0;
            float sum = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();

            }
            for (int i = 0; i<arr.length ; i++) {
                if (arr[i] < 0) {
                    countD++;
                }
                if(arr[i] > 0){
                    sum += arr[i];
                    countS++;
                }
            }
            if (sum == 0) {
                System.out.print(countD +" 0.0" );
            } else if (sum != 0) {
                System.out.print(countD + " " +String.format("%.1f",sum/countS)+"\n");

            }


        }
    }
}
