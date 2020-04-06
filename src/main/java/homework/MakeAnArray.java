//Задание №9: Ввод/вывод данных для массива
//Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива
// на экран, где каждый элемент массива умножается на 2. Размер массива задается пользователем.

package homework;

import java.util.Scanner;

public class MakeAnArray {
    public void makeAnArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your array's size");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter your array's element number " + (i + 1));
            array[i] = in.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] * 2 + " ");
        }
    }
}
