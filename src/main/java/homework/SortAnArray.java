//Задача №15: Сортировка данных в массиве Задание
//Написать программу сортировки по возрастанию заданного пользователем массива чисел.
//Использовать пузырьковый метод сортировки.

package homework;

import java.util.Scanner;

public class SortAnArray {
    public void sortAnArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your array's size");
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter your array's element number " + (i + 1));
            array[i] = in.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (array[j] > array[j + 1])
                    swap(array, j, j + 1);
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    void swap(int[] a, int left, int right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
    }
}
