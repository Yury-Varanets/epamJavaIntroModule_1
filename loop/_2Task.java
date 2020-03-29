package _1BasicsOfSoftwareCodeDev.loop;

/*
Вычислить значения функции на отрезке [a,b] с шагом h.
y = x, при x > 2 и y = -x, при x <=2
 */

import java.util.Scanner;

public class _2Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int h;
        int x;
        int y;

        int temp;

        System.out.println("Введите значение отрезка [a, b]:");
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("Введите значение шага h = ");
        h = scanner.nextInt();

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        for ( x = a; x <= b; x += h){
            if (x > 2) y = x;
            else y = -x;
            System.out.print(" " + y);
        }

    }

}