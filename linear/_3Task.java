package _1BasicsOfSoftwareCodeDev.linear;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
sin x + cos y
-------------  - tg xy
cos x - sin y
 */

import java.util.Scanner;

public class _3Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x;
        double y;
        double result;

        System.out.println("Введите действительные значения следующих чисел: ");
        System.out.print("x = ");
        x = scanner.nextDouble();
        System.out.print("y = ");
        y = scanner.nextDouble();

        result = Math.sin(x) + Math.cos(y);
        result /= Math.cos(x) - Math.sin(y);
        result -= Math.tan(x * y);

        System.out.println("result = " + result);

    }

}
