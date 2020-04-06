//Задача №17: Запись данных в файл Задание
//Необходимо написать программу, которая будет записывать текстовые данные,
// введенные с экрана, в файл .txt. Запись ввести в файл до тех пор,
// пока не будет введена команда стоп в консоли. Пользователь при тестировании
// программы по правилу черного ящика должен понимать, какой принцип остановки
// записи в файл он должен подать.

package homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteIntoFile {
    public void writeIntoFile() throws IOException {
        FileWriter nFile = new FileWriter("myfile2.txt", true);
        Scanner in = new Scanner(System.in);
        System.out.println("Type the text you wish to record in myfile2.txt and press Enter." +
                " Type 'stop' when you are done.");
        while (in.hasNext()) {
            String str = in.nextLine();
            if (str.equals("stop")) {
                break;
            } else {
                nFile.append(str).append("\r\n");
            }
        }
        nFile.close();
    }
}
