//3. Конвертер строк в числа
//Напишите функцию, которая принимает строку и пытается конвертировать её в целое число. Если строка не может быть конвертирована, выбрасывайте NumberFormatException.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите строку для конвертации в целое число: ");
            String input = scanner.nextLine();

            int result = convertToInteger(input);
            System.out.println("Результат конвертации: " + result);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int convertToInteger(String str) throws NumberFormatException {
        try {
            return Integer.parseInt(str);  // Попытка конвертации строки в число
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Ошибка: Строку \"" + str + "\" невозможно конвертировать в целое число.");
        }
    }
}
