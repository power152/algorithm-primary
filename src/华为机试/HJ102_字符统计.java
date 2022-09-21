package 华为机试;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class HJ102_字符统计 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        TreeMap<Character,Integer> map = new TreeMap<>();

        // 将字符存入 TreeMap中
        for (int i =0 ;i<str.length();i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i),1);
            } else {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }

        // 找到max值
        int max = 0;
        for (int val:map.values()){
            if (val>max){
                max = val;
            }
        }

        //输出
        while(max>0){
            for (char key:map.keySet()){
                if (map.get(key) == max) {
                    System.out.print(key);
                }

            }
            max--;
        }
    }
}
