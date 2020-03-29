package _1BasicsOfSoftwareCodeDev.branching;

/*
Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
и если да, то будет ли он прямоугольным.
 */

import java.util.Scanner;

public class _1Task {

    public static void main(String[] args) {

        double a;
        double b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два угла треугольника.");
        System.out.print("а = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();

        if ((a + b < 180) && (a > 0) && (b > 0)) {
            System.out.print("Треугольник с углами " + a + " и " + b + " градусов существует, ");
            if ((a == 90) || (b == 90) || (a + b == 90)) {
                System.out.print("прямоугольный.");
            }
            else System.out.print("не прямоугольный.");
        }
        else System.out.println("Треугольник с углами " + a + " и " + b + " не существует");

    }

}
