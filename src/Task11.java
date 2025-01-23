//11. Конвертация в двоичную систему
//Создайте функцию, которая конвертирует целое число в двоичную строку. Если число отрицательное, выбрасывайте исключение.
public class Task11 {
    public static void main(String[] args) {
        int number = 10;  // Пример числа для конвертации

        try {
            String binaryString = convertToBinary(number);
            System.out.println("Число в двоичной системе: " + binaryString);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String convertToBinary(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Ошибка: Невозможно конвертировать отрицательное число в двоичную систему.");
        }
        return Integer.toBinaryString(number);
    }
}
