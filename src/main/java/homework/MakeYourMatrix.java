//Задание №10: Ввод/вывод данных для матрицы
//Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод
// первой строки матрицы на экран, где каждый элемент умножается на 3.
// Размерность матрицы задается пользователем.

package homework;

import java.util.Scanner;

public class MakeYourMatrix {
    public void makeYourMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your matrix's size");
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your matrix's row number " + (i + 1) + ". Separate your elements by blank space");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.print(matrix[0][i] * 3 + " ");
        }
    }
}
