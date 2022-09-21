package 华为机试;

import java.util.HashMap;
import java.util.Scanner;

public class HJ21_SamplePassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        HashMap<Character,Character> codeMap = new HashMap<>();
        codeMap.put('1', '1');
        codeMap.put('a', '2');
        codeMap.put('b', '2');
        codeMap.put('c', '2');
        codeMap.put('d', '3');
        codeMap.put('e', '3');
        codeMap.put('f', '3');
        codeMap.put('g', '4');
        codeMap.put('h', '4');
        codeMap.put('i', '4');
        codeMap.put('j', '5');
        codeMap.put('k', '5');
        codeMap.put('l', '5');
        codeMap.put('m', '6');
        codeMap.put('n', '6');
        codeMap.put('o', '6');
        codeMap.put('p', '7');
        codeMap.put('q', '7');
        codeMap.put('r', '7');
        codeMap.put('s', '7');
        codeMap.put('t', '8');
        codeMap.put('u', '8');
        codeMap.put('v', '8');
        codeMap.put('w', '9');
        codeMap.put('x', '9');
        codeMap.put('y', '9');
        codeMap.put('z', '9');
        codeMap.put('0', '0');
        for(int i = 0; i< str.length() ; i++) {
            char c = str.charAt(i);
            if(c>= 'a' && c<= 'z') {
                c = codeMap.get(c);
            }
            if(c>='A' && c<='Z') {
                c = Character.toLowerCase(c);
                if(c == 'z') {
                    c = 'a';
                } else {
                    c++;
                }
            }
            System.out.print(c);
        }

    }
}
