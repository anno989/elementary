package ru.condition;

public class X2 {
    public static int calc1(int a1, int b1, int c1, int x1) {
        return a1 * x1 * x1 + b1 * x1 + c1;
    }

    public static int calc2(int a2, int b2, int c2, int x2) {
        return a2 * x2 * x2 + b2 * x2 + c2;
    }

    public static int calc3(int a3, int b3, int c3, int x3) {
        return a3 * x3 * x3 + b3 * x3 + c3;
    }

    public static int calc4(int a4, int b4, int c4, int x4) {
        return a4 * x4 * x4 + b4 * x4 + c4;
    }

    public static void main(String[] args) {
        int a1 = 1;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int a2 = 0;
        int b2 = 1;
        int c2 = 1;
        int x2 = 1;
        int a3 = 1;
        int b3 = 1;
        int c3 = 0;
        int x3 = 1;
        int a4 = 1;
        int b4 = 1;
        int c4 = 1;
        int x4 = 0;
        int rsl1 = X2.calc1(a1, b1, c1, x1);
        int rsl2 = X2.calc2(a2, b2, c2, x2);
        int rsl3 = X2.calc3(a3, b3, c3, x3);
        int rsl4 = X2.calc4(a4, b4, c4, x4);
        System.out.println(rsl1);
        System.out.println(rsl2);
        System.out.println(rsl3);
        System.out.println(rsl4);
    }
}


