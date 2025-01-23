//12. Проверка делимости
//Реализуйте функцию, которая принимает два числа и проверяет, делится ли первое число на второе. Если второе число равно нулю, выбрасывайте ArithmeticException.
public class Task12 {
    public static void main(String[] args) {
        int numerator = 10;  // Первое число (делимое)
        int denominator = 0; // Второе число (делитель)

        try {
            checkDivisibility(numerator, denominator);
            System.out.println(numerator + " делится на " + denominator);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkDivisibility(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Ошибка: Деление на ноль невозможно.");
        }
        if (numerator % denominator == 0) {
            System.out.println("Число " + numerator + " делится на " + denominator);
        } else {
            System.out.println("Число " + numerator + " не делится на " + denominator);
        }
    }
}
