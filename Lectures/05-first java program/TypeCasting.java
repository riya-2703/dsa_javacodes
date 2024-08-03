import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);

        // type casting
        int n= (int)(67.56f);
        System.out.println(n);

        // automatic type promotion in expressions
       int a = 257;
       byte b = (byte)(a); // 257 % 256 = 1
       System.out.println(b);

       byte c = 40;
       byte d = 50;
       byte e = 100;
       int f = c * d / e;
       System.out.println(f);

       byte m = 50;
       m = (byte) (m * 2);
       System.out.println(m);

       int number = 'A';
       System.out.println(number);
       System.out.println("你好");
       System.out.println(3 * 6);

        // byte b = 42;
        // char c = 'a';
        // short s = 1024;
        // int i = 50000;
        // float f = 5.67f;
        // double d = 0.1234;
        // double result = (f * b) + (i / c) - (d * s);
        // // float + int - double = double
        // System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        // System.out.println(result);
    }
}
