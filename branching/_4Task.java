package _1BasicsOfSoftwareCodeDev.branching;

/*
Заданы размеры А, В прямоугольного отверстия и размеры x, y, z кирпича.
Определить, пройдет ли кирпич через отверстие.
 */

import java.util.Scanner;

public class _4Task {

    public static void main(String[] args) {

        int a, b; // размеры отверстия
        int x, y , z ; // размеры кирпича
        boolean state = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размеры прямоугольного отверстия: (целочисленные)");
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();

        System.out.println("Введите размеры кирпича: (целочисленные)");
        System.out.print("x = ");
        x = scanner.nextInt();
        System.out.print("y = ");
        y = scanner.nextInt();
        System.out.print("z = ");
        z = scanner.nextInt();

        if ((x <= a) && ((y <= b) || (z <= b))) state = true;
        else if ((y <= a) && ((x <= b) || (z <= b))) state = true;
        else if ((z <= a) && ((x <= b) || (y <= b))) state = true;


        if (state) System.out.println("Кирпич проходит через отверстие.");
        else System.out.println("Кирпич не проходит через отверстие.");

    }

}
