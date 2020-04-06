//Задача №18: Выгрузка данных из файла, проверка и перезапись Задание
//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt, а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
//Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.

package homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndRewrite {
    public void readAndRewrite() throws IOException {
        FileReader fr= new FileReader("myfile1.txt");
        Scanner scan = new Scanner(fr);
        int counter = 0;
        while (scan.hasNextLine() && !scan.nextLine().equals("")){
            counter++;
        }
        fr.close();

        FileWriter nFile = new FileWriter("myfile1.txt");
        Scanner in = new Scanner(System.in);
        System.out.println("Type " + counter + " line(s).");
        for (int i = 0; i < counter; i++) {
            nFile.append(in.nextLine()).append("\r\n");
        }
        nFile.close();
    }
}
