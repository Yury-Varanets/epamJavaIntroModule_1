package _1BasicsOfSoftwareCodeDev.loop;

/*
Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class _8Task {

    public static void main(String[] args) {

        int num1 = 6251347;
        int num2 = 914817263;
        final int DIV = 10;

        int temp1; // временное хранение чисел num1
        int temp2; // и num2 соответственно

        int n1; // поочередное хнранение цифр входящих
        int n2; // в num1 и num2

        boolean state = false; // значение совподения цифр в числах

        for (int i = 0; i <= 9; i++){
            temp1 = num1;
            temp2 = num2;
            do {
                n1 = temp1 % DIV;
                temp1 /= DIV;
                if (n1 == i) {
                    temp1 = 0;
                    do {
                        n2 = temp2 % DIV;
                        temp2 /= DIV;
                        if (n2 == n1) {
                            System.out.print(" " + n2);
                            state = true;
                            temp2 = 0;
                        }
                    }while (temp2 != 0);
                }
            }while (temp1 != 0);

        }
        if (state == false) System.out.println("Нет совпадений.");


    }

}
