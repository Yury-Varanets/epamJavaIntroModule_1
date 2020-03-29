package _1BasicsOfSoftwareCodeDev.linear;

/*
Дано натуральное число Тб которое педставляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часахб минутах и секундах в следующей форме:
ННч ММмин SSс
 */

import java.util.Scanner;

public class _5Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t;
        int temp;
        final int HOUR = 3600;
        final int MIN = 60;
        String time = new String();

        System.out.print("Введите проивольное натуральное число Т (длительномть времени в секундах) = ");
        t = scanner.nextInt();

        temp = (int)Math.floor(t / HOUR);
        time += temp + "ч ";

        t -= temp * HOUR;
        temp = (int)Math.floor(t / MIN);
        time += temp + "мин ";

        temp = t % MIN;
        time += temp + "с ";

        System.out.println(time);

    }

}
