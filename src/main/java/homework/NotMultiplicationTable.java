//Задача №5: Таблица умножения Задание
//Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.

package homework;

import java.util.Scanner;

public class NotMultiplicationTable {
    public void notMultiplicationTable(){
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(number + " x 1 = " + 1 * number);
        System.out.println(number + " x 2 = " + 2 * number);
        System.out.println(number + " x 3 = " + 3 * number);
        System.out.println(number + " x 4 = " + 4 * number);
        System.out.println(number + " x 5 = " + 5 * number);
        System.out.println(number + " x 6 = " + 6 * number);
        System.out.println(number + " x 7 = " + 7 * number);
        System.out.println(number + " x 8 = " + 8 * number);
        System.out.println(number + " x 9 = " + 9 * number);
        System.out.println(number + " x 10 = " + 10 * number);

    }
}
