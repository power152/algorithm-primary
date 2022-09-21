package 华为机试;


import java.util.HashMap;
import java.util.Scanner;

/***
 思路：
 1.将每个字符对应的个数存放在map中，并得到个数最少的值min
 2.用map.values()得到所有value的集合并找出其中最小值min
 3.循环对比map.get(key) == min, 相等则将key取出，在原字符串中replaceAll
 运行时间：47ms
 占用内存：10776KB
 ***/

public class HJ23_deleteStringMinChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashMap<Character,Integer> map = new HashMap<>();

        while(scan.hasNext()) {
            String str = scan.nextLine();
            char[] ch = str.toCharArray();

            int min = Integer.MAX_VALUE;
            // 将每个字符对应的个数存放在map中
            for (char c:ch) {
                map.put(c,map.getOrDefault(c,0)+1);

            }
            // map.values（） 得到所有value集合并找出其中最小值min
            for (int i:map.values()) {
                min = Math.min(min,i);
            }

            // 循环对比map.get(key) == min, 相等则将key取出，在原字符串中replaceAll
//            for (char c:map.keySet()) {
//                if (map.get(c) == min) {
//                    str = str.replaceAll(String.valueOf(c),"");
//                }
//            }

            // 这里改用StringBuilder，判断不等于min 就 append
            StringBuilder sb = new StringBuilder();
            for (char c:ch) {
                if (map.get(c) != min) {
                    sb.append(c);
                }

            }
            System.out.print(sb);
        }

    }
}


//    Scanner scan = new Scanner(System.in);
//    HashMap<Character,Integer> map =new HashMap<>();
//        while(scan.hasNext()) {
//                String str =scan.nextLine();
//                char[] ch = str.toCharArray();
//
//                // 将每个字符对应的个数存放在map中
//                for (char c:ch) {
//                map.put(c,map.getOrDefault(c,0)+1);
//                }
//
//                // map.values（） 得到所有value集合并找出其中最小值min
//                int min = Integer.MAX_VALUE;
//                for (int i:map.values()) {
//                min = Math.min(min,i);
//                }
//
//                // 循环对比map.get(key) == min, 相等则将key取出，在原字符串中replaceAll
//                for (char c :map.keySet()) {
//                if (map.get(c) == min) {
//                str = str.replaceAll(String.valueOf(c),"");
//                }
//                }
//                System.out.println(str);
//                }
