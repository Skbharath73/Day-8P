package points.comparison;

import java.util.Scanner;

public class UC2 {
    Scanner s = new Scanner(System.in);
    int x = s.nextInt();
    int y = s.nextInt();
    int a = s.nextInt();
    int b = s.nextInt();
    int X = s.nextInt();
    int Y = s.nextInt();
    int A = s.nextInt();
    int B = s.nextInt();

    double lengthOfPoints1() {
        System.out.print("(" + x + "," + y + ")");
        System.out.println("(" + a + "," + b + ")");
        double l;
        l = Math.sqrt((int) Math.pow((a - x), 2) + (int) Math.pow((b - y), 2));
        return l;
    }

    double lengthOfPoints2() {
        System.out.print("(" + X + "," + Y + ")");
        System.out.println("(" + A + "," + B + ")");
        double l;
        l = Math.sqrt((int) Math.pow((A - X), 2) + (int) Math.pow((B - Y), 2));
        return l;
    }

    public static void main(String[] args) {
        UC2 uc2 = new UC2();
        Object o1=uc2.lengthOfPoints1();
        System.out.println(o1);
        Object o2=uc2.lengthOfPoints2();
        System.out.println(o2);
        System.out.println(o1.equals(o2));
    }
}
