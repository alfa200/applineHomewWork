//Итоговая задача №1 Задание
// Ввести с консоли число в бинарном формате. Перевести его в десятичный формат,
// записать в переменную int и вывести на экран. Необходимо использовать циклы,
// нельзя использования готовые методы языка Java, для перевода числа из одной
// системы счисления в другую.

package homework;

import java.util.Scanner;

public class BinaryToInt2 {
    static BinaryToInt bti = new BinaryToInt();

    public void binaryToInt2() {
        System.out.println("Enter a binary number");
        Scanner in = new Scanner(System.in);
        int biNumber = in.nextInt();
        int number = 0;
        String biString = String.valueOf(biNumber);
        if (bti.isBinary(biString)) {
            for (int i = 0; i <= biString.length(); i++) {
                int n = biNumber % 10;
                number += n * Math.pow(2, i);
                biNumber = biNumber / 10;
            }
            System.out.println(number);
        } else {
            System.out.println("The entered number is not binary!");
        }

    }
}

