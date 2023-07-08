package unit1;

public class Scope {
    public static void main(String[] args) {
        int beMax = 128;
        byte beMin = -128;
        long beMax_1 = 2147483648L;
        double a = 3.777E9;
        double v = 3.777E9;
        float b = 1.7777E10F;
        char c = '\u4e2d';
        boolean d = true;
        byte e = 127;
        int f = e;
        //尝试超范围溢出 int转byte
        int g = 129;
        byte h = (byte)g;
        //再次尝试
        double i = 3.403E38;
        float j = (float)i;
        //尝试将double 的浮点数基本数据类型转换为 整数的 long。
        double k = 129.172;
        byte l = (byte)k;
        char m = '\u4e2d';
        long n = (long)m + 1;
        System.out.println(n);
    }
}
