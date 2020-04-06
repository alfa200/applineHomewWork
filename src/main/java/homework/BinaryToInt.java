//Задача №4: Отработка поразрядных операций Задание
//Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.

package homework;

        import java.util.Scanner;

public class BinaryToInt {
    public void binaryToInt() {
        System.out.println("Enter a binary number");
        Scanner in = new Scanner(System.in);
        int biNumber = in.nextInt();
        String biString = String.valueOf(biNumber);
        if (isBinary(biString)) {
            System.out.println(Integer.parseInt(biString, 2));
        } else {
            System.out.println("The entered number is not binary!");
        }
    }

    public boolean isBinary(String str) {
        if (!str.contains("2") && !str.contains("3") && !str.contains("4")
                && !str.contains("5") && !str.contains("6") && !str.contains("7")
                && !str.contains("8") && !str.contains("9")) {
            return true;
        } else {
            return false;
        }
    }

}
