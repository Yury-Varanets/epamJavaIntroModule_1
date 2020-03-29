package _1BasicsOfSoftwareCodeDev.branching;

/*
Вычислить значение функции
        | x^2 - 3x + 9,  если x <= 3;
F(x) == | ___1___
        | x^3 + 6        если x > 3;
 */

import java.util.Scanner;

public class _5Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        double f;

        System.out.print("введите значение х = ");
        x = scanner.nextInt();

        if (x <= 3) {
            f = Math.pow(x, 2) - (3 * x) + 9;
        }
        else {
            f = 1./(Math.pow(x, 3) + 6);
        }

        System.out.println("При x = " + x + " , f = " + f);

    }

}