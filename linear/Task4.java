package _1BasicsOfSoftwareCodeDev.linear;

/*
Дано действительное число r вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

import java.util.Scanner;

public class _4Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double r;
        int temp;
        final double CONST = 1000;

        System.out.print("Введите число вида nnn,ddd r = ");
        r = scanner.nextDouble();
        temp = (int)Math.floor(r);                  // temp = nnn
        r = r - temp;                               // r = .ddd
        r *= CONST;                                 // r = ddd
        r = Math.round(r) + (temp / CONST);         // r = ddd.nnn

        System.out.println("after replace r = " + r);

    }

}
