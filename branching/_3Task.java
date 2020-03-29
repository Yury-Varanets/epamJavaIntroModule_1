package _1BasicsOfSoftwareCodeDev.branching;

/*
Даны три точки A(x1, y1), B(x2, y2) и C(x3, y3).
Определить будут ли они расположены на одной прямой.
 */

import java.util.Scanner;

public class _3Task {

    public static void main(String[] args) {

        int x1, x2, x3, y1, y2, y3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты трех точек:");
        System.out.print("A: x1 = ");
        x1 = scanner.nextInt();
        System.out.print("   y1 = ");
        y1 = scanner.nextInt();
        System.out.print("B: x2 = ");
        x2 = scanner.nextInt();
        System.out.print("   y2 = ");
        y2 = scanner.nextInt();
        System.out.print("C: x3 = ");
        x3 = scanner.nextInt();
        System.out.print("   y3 = ");
        y3 = scanner.nextInt();

        if ((x1 - x3) / (y1 - y3) == (x1 - x2) / (y1 - y2))
            System.out.println("Точки принадлежат одной прямой");
        else System.out.println("Точки не принадлежат одной прямой");

    }

}
