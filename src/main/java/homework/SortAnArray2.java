//Итоговая задача №2 Задание
//Написать программу сортировки по возрастанию заданного пользователем массива чисел.
// Пользователь программы должен задавать размер массива и наполнять его числами.
// Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.

package homework;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArray2 {

    public void sortAnArray2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your array's size");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter your array's element number " + (i + 1));
            array[i] = in.nextInt();
        }
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    //Алгоритм Шелла
    void sort(int[] array) {
        int h = 1;
        while (h * 3 < array.length) {
            h = h * 3 + 1;
        }
        while (h >= 1) {
            hSort(array, h);
            h = h / 3;
        }
    }

    void hSort(int[] array, int h) {
        int length = array.length;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] < array[j - h])
                    swap(array, j, j - h);
                else
                    break;
            }
        }
    }

    void swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

}


