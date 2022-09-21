package 华为机试;

import java.util.HashMap;
import java.util.Scanner;

public class HJ94_记票统计 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            // 候选人数
            int num = Integer.valueOf(scan.nextLine());
            // 候选人
            String[] candidates = scan.nextLine().toUpperCase().split(" ");
            // 投票人数
            int voter = Integer.valueOf(scan.nextLine());
            // 票
            String[] ticket = scan.nextLine().toUpperCase().split(" ");
            // 不合法票数
            int invalid = 0;

            HashMap<String, Integer> map = new HashMap<>();
            for (String s : candidates) {
                map.put(s, 0);
            }

            for (String s : ticket) {
                if (map.containsKey(s)) {
                    map.put(s,map.getOrDefault(s,0)+1);
                } else {
                    invalid++;
                }
            }

            // 打印
            for (String s:candidates) {
                System.out.println(s +" : " + map.get(s));
            }
            System.out.println("Invalid : "+invalid);

        }
        //scan.close();
    }
}
