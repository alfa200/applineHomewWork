//Задача №14: Преобразование типов Задание
//Необходимо написать программу, которая будет реализовывать следующие действия:
//1. Ввод числа с клавиатуры и запись его в строковую переменную S
//2. Конвертация строковой переменной S в числовую переменную X типа int
//3. Конвертация числа X типа int в число Y типа double
//Все три числа разных типов необходимо в столбик вывести на экран

package homework;

import java.util.Scanner;

public class ChangeTypes {
    public void changeTypes(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        String S = in.nextLine();
        int X = Integer.valueOf(S);
        double Y = Double.valueOf(X);
        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);
    }
}
