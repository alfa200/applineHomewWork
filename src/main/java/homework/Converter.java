//Итоговая задача №3 Задание
//Напишите программу конвертер валют. Программа должна переводить рубли в
//доллары по текущему курсу. Пользователь вводит текущий курс и количество рублей.
//Итоговое значение должно быть округлено до двух знаков после запятой.
//(Пример для теста работы программы: Курс доллара = 67,55,
// Количество рублей: 1000, Итого: 14,80 долларов)

package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Converter {
    public void converter(){
        System.out.println("Введите сумму для конвертации и курс");
        Scanner in = new Scanner(System.in);
        double m = in.nextDouble(); //Сумма
        double n = in.nextDouble(); //Курс
        if (n <= m) {
            DecimalFormat df = new DecimalFormat(".##");
            System.out.println(df.format(m/n));
        } else {
            DecimalFormat df = new DecimalFormat("0.##");
            System.out.println(df.format(m/n));
        }


    }
}
