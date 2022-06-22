package newbie0.class05;

/**
 * @author liuyandeng
 * @date 22/6/2022
 * @Description 位图的实现
 */

public class Bitmap {

    public static void main(String[] args) {
//        System.out.println( 170 %64);
//        System.out.println( 170 &63);
    }

    private long[] bits;

    public Bitmap(int max) {
        //这里就需要这么长的数组才可以把 0 ~ max 全装下

        /**
         * (max+64)/64 --> (max+64) >> 6 , 向右移就是除 ，2的6次方 = 64
         * 为什么是 64 ，因为 long 类型是64位，你要查找的数在数组中那一个数上，比如说 65 ，哪么就在数组的第二个数上。
         * 这里假设 max == 0
         */
        bits = new long[(max + 64) >> 6];
    }

    public void add(int num) {

        /**
         * num / 64 ;这里判断的是新加的一个数应该放在哪一个整数里面，such as： 170应该放在 170 / 64 == 2 这个整数下
         * in the second place 这个170应该 2 这个整数的第 几 位 尼？？？？
         *  170 % 64 从右往左数，就可以确定是 第几位 。 170%64 --> 170 & 63; 0~63是在第7个比特位里面的。
         *  bits[num >> 6] |= num & 63;
         *
         *  last but not least 我们找的 是第几位过后 ，要在对应的位置 mark 上 1，做个标记，说明在一个集合里面他是 add exist 的。
         *  mark 1 就是 使用或运算 | 有1则1 来完成标记
         *
         */

        // 这里long类型就是64位，往左移动对应的为 然后 或运算。
        // bits[num >> 6] = bits[num >> 6] | (1L<<(num&63));
        bits[num >> 6] |= (1L << (num & 63));

    }

    public void delete(int num) {

        /**
         * 删除就是把 数组中的整数里面的64位对应下来的具体的位取反,再按位与一下“&”，让具体的bit位 变为 0 ； 1-->0
         */
        bits[num >> 6] &= ~(1L << (num & 63));
    }

    public boolean contains(int num) {
        // 这里就是判读这个数的 64 位里面 对应具体的位数 是否为0； 0 --> inexistence,1-->exist
        return (bits[num >> 6] & (1L << (num &63))) !=0;
    }
}
