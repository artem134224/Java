//17. Остаток от деления
//Создайте функцию, которая возвращает остаток от деления двух чисел. Если второе число равно нулю, выбрасывайте исключение.

public class Task17 {
    public static void main(String[] args) {
        int numerator = 10;  // Первое число (делимое)
        int denominator = 0; // Второе число (делитель)

        try {
            int remainder = getRemainder(numerator, denominator);
            System.out.println("Остаток от деления: " + remainder);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getRemainder(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Ошибка: Деление на ноль невозможно.");
        }
        return numerator % denominator;
    }
}
