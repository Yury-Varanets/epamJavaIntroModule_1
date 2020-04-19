package _1BasicsOfSoftwareCodeDev.linear;

/*
Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит области, и false - в противном случае.

 */

import java.util.Scanner;

public class _6Task {

    public static void main(String[] args) {

        int x;
        int y;
        boolean state = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точки:");
        System.out.print("x = ");
        x = scanner.nextInt();
        System.out.print("y = ");
        y = scanner.nextInt();
        if ((((x >= -2) && (x <= 2)) && ((y <= 4) && (y >= 0))) || (((x >= -4) && (x <= 4)) && ((y <= 0) && (y >= -3)))){
            state = true;
        }

        System.out.println(state);
    }

}
