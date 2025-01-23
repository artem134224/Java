//19. Конвертер температуры
//Напишите функцию, которая переводит температуру из Цельсия в Фаренгейт. Если температура меньше абсолютного нуля, выбрасывайте исключение.

public class Task19 {
    public static void main(String[] args) {
        double celsius = -300;  // Пример температуры в Цельсиях

        try {
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + " °C = " + fahrenheit + " °F");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double celsiusToFahrenheit(double celsius) throws IllegalArgumentException {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Ошибка: Температура ниже абсолютного нуля.");
        }
        return (celsius * 9/5) + 32;
    }
}
