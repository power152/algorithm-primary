package LeetCode;

import java.util.HashMap;
import java.util.Random;

/**
 * @author Kiteye
 * @date 19/8/2022
 * @Description
 */

public class LeetCode_535 {
    public static String getRandomNum(int lenght) {
        String str = "abcdefghijklmnABCDEFGHIGKLMN0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lenght; i++) {
            int num = random.nextInt(6);
            sb.append(str.charAt(num));
        }
        return sb.toString();
    }

    // 加密解密是有对应的映射关系
    HashMap<String, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        // http://tinyurl.com/4e9iAk
        // 简化最后的数是随机数 这个随机数设为key
        String key = getRandomNum(6);
        while (map.containsKey(key)) {
            key = getRandomNum(6);
        }
        map.put(key, longUrl);
        return "http://tinyurl.com/" + key;

    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        // 需要拿到k
        // lastIndexOf 该对象表示的字符序列中最后一次出现的字符的索引下标，如果该字符没有出现，则为-1。
        int p = shortUrl.lastIndexOf('/') + 1;
        String key = shortUrl.substring(p);
        return map.get(key);
    }

    public static void main(String[] args) {
        LeetCode_535 sol = new LeetCode_535();
        System.out.println(sol.encode("https://leetcode.com/problems/design-tinyurl"));
    }
}
