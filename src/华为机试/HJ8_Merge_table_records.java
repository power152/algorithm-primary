package 华为机试;

import java.util.Scanner;
import java.util.TreeMap;

public class HJ8_Merge_table_records {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 1; i <= n; i++) {
            int key = scan.nextInt();
            int value = scan.nextInt();
            if (treeMap.containsKey(key)) {
                treeMap.put(key,treeMap.get(key)+value);
            } else {
                treeMap.put(key,value);
            }
        }
        for (Integer key :treeMap.keySet()) {
            System.out.println(key + " " +treeMap.get(key));
        }
    }
}
