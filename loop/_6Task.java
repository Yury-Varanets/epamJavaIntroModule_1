package _1BasicsOfSoftwareCodeDev.loop;

/*
Вывести на экран соответствий между символами и их
численными обозначениями в памяти компьютера.
 */

public class _6Task {

    public static void main(String[] args) {

        int num;
        int count = 0;

        for (num = 0; num <= 255; num++, count++){
            System.out.print((char)num + " - " + num + "\t");
           if (count == 9) {
                System.out.println();
                count = 0;
            }
        }

    }

}