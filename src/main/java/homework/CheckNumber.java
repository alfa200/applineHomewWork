//Задача №7: Условие вывода данных Задание
//Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число
// в переменную number. В программе должны присутствовать константы X, Y, Z.
// Программа должна сравнивать введенное значение с клавиатуры со значением констант и
// вывести на экран сообщение "Данное значение имеется в константах"
// если number=X или Y или Z. Если переменная отличается от констант,
// нужно вывести оповещение "Такой константы нет!"

package homework;

import java.util.Scanner;

public class CheckNumber {
    double x = 1;
    double y = 2;
    double z = 3;

    public void checkNumber() {
        System.out.println("Enter a number to compare");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        if (number == x || number == y || number == z) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет!");
        }
    }
}
