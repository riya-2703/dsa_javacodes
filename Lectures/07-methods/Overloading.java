public class Overloading {
    public static void main(String[] args) {
        fun(99);
        fun("Riya Nadagire");
        System.out.println(sum(3,4,5));
        System.out.println(sum(90,90));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
