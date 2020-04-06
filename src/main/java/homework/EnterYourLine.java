//Задача №11: Ввод строки с клавиатуры Задание
//Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную.
//Результат вывести на экран.

package homework;

import java.util.Scanner;

public class EnterYourLine {
    public void enterYourLine() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your line");
        String str = in.nextLine();
        System.out.println(str);
    }
}
