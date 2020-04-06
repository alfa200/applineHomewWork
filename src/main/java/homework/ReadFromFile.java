//Задача №16: Выгрузка данных из файла на экран Задание
//Необходимо написать программу,
//которая будет выводить на экран текстовые данные из файла .txt

package homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public void readFromFile() throws IOException {
        FileReader fr= new FileReader("myfile1.txt");
        Scanner scan = new Scanner(fr);
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
        fr.close();

    }
}
