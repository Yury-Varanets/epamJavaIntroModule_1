package _1BasicsOfSoftwareCodeDev.branching;

/*
найти max(min(a,b),min(c,d))
 */

import java.util.Scanner;

public class _2Task {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;
        int min1;
        int min2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения a, d, c и d (!! целочисленные !!)");
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();
        System.out.print("d = ");
        d = scanner.nextInt();

        if (a < b) min1 = a;
        else min1 = b;
        if (c < d) min2 = c;
        else min2 = d;

        if (min1 > min2) System.out.println("max(min(a,b),min(c,d)) = " + min1);
        else System.out.println("max(min(a,b),min(c,d)) = " + min2);

    }

}
