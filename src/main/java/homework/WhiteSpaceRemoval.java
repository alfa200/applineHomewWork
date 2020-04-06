//Задача №12: Удаление всех пробелов в заданном тексте Задание
//Для введенной с клавиатуры строки необходимо провести
//отсев пробелов. Результат в виде строки без пробелов вывести на экран.

        package homework;

import java.util.Scanner;

public class WhiteSpaceRemoval {
    public void whiteSpaceRemoval(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = in.nextLine();
        String str2 = str.replaceAll("\\s", "");
        System.out.println(str2);
    }
}
