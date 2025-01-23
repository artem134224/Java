//20. Проверка строки на пустоту
//Создайте функцию, которая проверяет, является ли строка пустой или null. Если строка пустая или равна null, выбрасывайте исключение.

public class Task20 {
    public static void main(String[] args) {
        String input = "";  // Пример строки для проверки

        try {
            checkString(input);
            System.out.println("Строка корректна.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkString(String str) throws IllegalArgumentException {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Ошибка: Строка не может быть пустой или равной null.");
        }
    }
}
