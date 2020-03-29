package _1BasicsOfSoftwareCodeDev.linear;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения)
        b + sqrt(b^2 + 4ac)
        ------------------- - a^3 * c + b^-2
                2a
 */

import java.util.Scanner;

public class _2Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;
        double result;

        System.out.println("Введите действительные значения следующих чисел: ");
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        System.out.print("c = ");
        c = scanner.nextDouble();

        //разделение вычисления вырожения на три части
        //первая
        result = b + Math.sqrt(Math.pow(b, 2) + (4 * a * c));
        //вторая
        result /= 2 * a;
        //третья
        result -= (Math.pow(a, 3) * c) - Math.pow(b, -2);

        System.out.println("result = " + result);
    }

}
