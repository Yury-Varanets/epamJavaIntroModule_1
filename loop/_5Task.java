package _1BasicsOfSoftwareCodeDev.loop;

/*
Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
модуль которых больше или равен заданному е. Общий член ряда имеет вид:
                  1     1
            An = --- + --- .
                 2^n   3^n
 */

public class _5Task {

    public static void main(String[] args) {

        double e = 0.55;
        double a;
        int n = 10;
        double sum = 0;

        for (int i = 1; i <= n; i++){
            a = (1. / Math.pow(2, i) + (1. / Math.pow(3, i)));
            if (a >= e){
                sum += a;
            }
        }
        System.out.println("sum = " + sum);
    }

}