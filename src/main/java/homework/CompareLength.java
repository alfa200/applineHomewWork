//Задача №13: Сравнение двух строк Задание
//Необходимо провести сравнение длины двух строк, которые были введены
//с клавиатуры и записаны в соответствующие переменные. Вывести на экран
//строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение.

package homework;

import java.util.Scanner;

public class CompareLength {
    public void compareLength(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two strings");
        String str = in.nextLine();
        String str2 = in.nextLine();
        if (str.length() > str2.length()) {
            System.out.println(str);
        } else if (str.length() < str2.length()){
            System.out.println(str2);
        } else {
            System.out.println("The strings have equal size");
        }
    }
}
