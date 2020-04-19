package _1BasicsOfSoftwareCodeDev.loop;

/*
Программа суммирует все числа от 1 до введеного пользователем числа.
 */

import java.util.Scanner;

public class _1Task {

    public static void main(String[] args) {

        System.out.print("Введите любое натуральное число num = ");

        Scanner scanner = new Scanner(System.in);
        int firsNum = 1;
        int lastNum;
        int temp;
        int result = 0;

        lastNum = scanner.nextInt();
        if (lastNum < 1) {
            temp = firsNum;
            firsNum = lastNum;
            lastNum = temp;
        }
        for (int i = firsNum; i <= lastNum; i++){
            result += i;
        }

        System.out.println("Сумма всех чисел от " + firsNum + " до " + lastNum + " = " + result);

    }

}
