//9. Обрезка строки
//Напишите функцию, которая принимает строку и число символов. Функция должна возвращать строку, обрезанную до указанного числа символов. Если число символов больше длины строки, выбрасывайте исключение.
public class Task9 {
    public static void main(String[] args) {
        String inputString = "Hello, world!";
        int length = 5;  // Количество символов для обрезки

        try {
            String result = trimString(inputString, length);
            System.out.println("Обрезанная строка: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String trimString(String str, int length) throws IllegalArgumentException {
        if (length > str.length()) {
            throw new IllegalArgumentException("Ошибка: Число символов больше длины строки.");
        }
        return str.substring(0, length);
    }
}
