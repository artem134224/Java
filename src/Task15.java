//15. Проверка даты
//Напишите функцию, которая проверяет, является ли строка корректной датой в формате "dd.MM.yyyy". Если формат неверен, выбрасывайте DateTimeParseException.

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Task15 {
    public static void main(String[] args) {
        String dateString = "25.12.2023";  // Пример строки с датой

        try {
            checkDateFormat(dateString);
            System.out.println("Дата корректна.");
        } catch (DateTimeParseException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkDateFormat(String date) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate parsedDate = LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Ошибка: Некорректный формат даты. Ожидаемый формат: dd.MM.yyyy", date, 0);
        }
    }
}
