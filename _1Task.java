package _1BasicsOfSoftwareCodeDev.linear;

/*
Найдите значение функции z = ((a - 3) * b / 2) + c
 */

import java.util.Scanner;

public class _1Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        double z;

        System.out.print("Enter number a = ");
        a = scanner.nextInt();
        System.out.print("Enter number b = ");
        b = scanner.nextInt();
        System.out.print("Enter number c = ");
        c = scanner.nextInt();

        z = ((a - 3) * (b / 2.)) + c;
        System.out.println("with a = " + a + ", b = " + b + ", c = " + c + ": z = " + z);

    }

}