package _1BasicsOfSoftwareCodeDev.loop;

/*
Для каждого натурального числа в промежутке от m до n вывести все делители,
кроме еденицы и самого числа. m и n вводятся с клавиатуры.
 */

import java.util.Scanner;

public class _7Task {

    public static void main(String[] args) {

        int m;
        int n;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter two number (m < n)");
            System.out.print("m = ");
            m = scanner.nextInt();
            System.out.print("n = ");
            n = scanner.nextInt();
            if (m >= n) System.out.println(" !!! m will be small than n !!!");
        }while (m >= n);

        for (int i = m; i <= n; i ++){
            System.out.print(i + ": ");
            for (int j = 2; j < i; j++ ){
                if (i % j == 0) System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
