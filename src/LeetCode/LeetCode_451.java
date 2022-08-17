package LeetCode;

import java.util.HashMap;

/**
 * @author Kiteye
 * @date 16/8/2022
 * @Description 根据字符出现频率排序
 */

public class LeetCode_451 {
    public String frequencySort(String s) {
        // System.out.println(s);
        // HashMap
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
//            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        StringBuffer sb = new StringBuffer();
        HashMap<Character, Integer> map2 = new HashMap<>(map); // () 里面加map不是很懂
        for (int i = 0; i < s.length(); i++) {
            for (char c : map2.keySet()) {
                map2.put(c,map2.get(c) -1);
                if (map2.get(c) == 0) {
                    // 把字符串出现频率少的放前面。
                    for (int j = 0; j < map.get(c); j++) {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.reverse().toString();
    }
}
