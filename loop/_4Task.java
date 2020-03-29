package _1BasicsOfSoftwareCodeDev.loop;

/*
Составить программу нохождения произведения
квадратов первых двухсот чисел.
 */

public class _4Task {

    public static void main(String[] args) {

        int p = 1;

        for (int i = 1; i <= 200; i++){
            p *= Math.pow(i, 2);
        }
        System.out.println("Прозведение квадратоа первых 200 чисел = " + p);

    }

}