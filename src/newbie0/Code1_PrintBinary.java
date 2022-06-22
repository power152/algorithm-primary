package newbie0;
/**
 * 打印一个数的 32 位 二进制数
 */

public class Code1_PrintBinary {
    public static void printBinary(int num) {
        // int 底层是 32 位
        for (int i = 31; i >= 0; i--) {
            // << 想左移动一位，
            // 0000 0100
            // 1------>
            // 当 1 在2下标的位置的时候 & 就是 1。
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num = 4;
        printBinary(num);
        System.out.println("=================");
        int c = 39290;
        int d = ~c;
        printBinary(c);
        printBinary(d);

        int a = 5;
        //换算成 补码了，然后展现是原码，补码的补码就是原码。
        int b = (~a + 1);
//        int b = -a;
        System.out.println(b);
    }
}
