//Задача №6: Отработка арифметических операций Задание
//Написать программу, которая будет выполнять следующие действия:
//1. Ввод трех чисел с клавиатуры x, y, z
//2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
//3. Деление среднего арифметического на 2 без остатка
//4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"

package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArithmeticOperations {
    public void arithmeticOperations() {
        System.out.println("Enter three numbers");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double arithmeticMean  = (x + y + z) / 3;
        DecimalFormat df = new DecimalFormat(".##");
        System.out.println(df.format(arithmeticMean));
        System.out.println("The arithmetic mean of " + x + " " + y + " " + z + " is " + df.format(arithmeticMean));
        if (arithmeticMean / 2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
